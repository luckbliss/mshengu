/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.client.web.content.setup.officeutils.costcentretype.form;

import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Button;
import com.vaadin.ui.ComboBox;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.TextField;
import zm.hashcode.mshengu.app.util.UIComboBoxHelper;
import zm.hashcode.mshengu.app.util.UIComponentHelper;
import zm.hashcode.mshengu.client.web.content.setup.officeutils.costcentretype.models.CostCentreItemBean;

/**
 *
 * @author Luckbliss
 */
public class CostCentreItemForm extends FormLayout {

    private UIComponentHelper UIComponent = new UIComponentHelper();
    private UIComboBoxHelper UIComboBox = new UIComboBoxHelper();
    private final CostCentreItemBean bean;
    public final BeanItem<CostCentreItemBean> item;
    public final FieldGroup binder;
    public ComboBox costCentreName;
    public ComboBox costCentreCategory;
    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button delete = new Button("Delete");

    public CostCentreItemForm() {
        bean = new CostCentreItemBean();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);
        HorizontalLayout buttons = getButtons();
        buttons.setSizeFull();

        // Determines which properties are shown
        update.setVisible(false);
        delete.setVisible(false);

        costCentreName = UIComboBox.getCostCentreType("Cost Centre Name:", "costCentreId", CostCentreItemBean.class, binder);
        costCentreCategory = UIComboBox.getCostCentreCategoryType("Cost Centre Category:", "costCentreCategoryId", CostCentreItemBean.class, binder);
        TextField type = UIComponent.getTextField("Item Category:", "name", CostCentreItemBean.class, binder);

        GridLayout grid = new GridLayout(3, 10);
        grid.setSizeFull();

        grid.addComponent(costCentreName, 0, 0);
        grid.addComponent(costCentreCategory, 1, 0);
        grid.addComponent(type, 2, 0);

        grid.addComponent(new Label("<br>", ContentMode.HTML), 0, 4, 2, 4);
        grid.addComponent(buttons, 0, 5, 2, 5);

        addComponent(grid);

    }

    private HorizontalLayout getButtons() {
        HorizontalLayout buttons = new HorizontalLayout();
        save.setSizeFull();
        edit.setSizeFull();
        cancel.setSizeFull();
        update.setSizeFull();
        delete.setSizeFull();

        buttons.addComponent(save);
        buttons.addComponent(edit);
        buttons.addComponent(cancel);
        buttons.addComponent(update);
        buttons.addComponent(delete);
        return buttons;
    }
}
