/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.client.web.content.fieldservices.servicerequest.forms;

/**
 *
 * @author Luckbliss
 *//**
public class ServiceRequestFollowUpForm extends FormLayout {

    private UIComponentHelper UIComponent = new UIComponentHelper();
    private UIComboBoxHelper UIComboBox = new UIComboBoxHelper();
    private final ServiceRequestFollowUpBean bean;
    public final BeanItem<ServiceRequestFollowUpBean> item;
    public final FieldGroup binder;
    private final MshenguMain main;
    // Define Buttons
    public Button save = new Button("Save");
    public Button edit = new Button("Edit");
    public Button cancel = new Button("Cancel");
    public Button update = new Button("Update");
    public Button back = new Button("Back");
    public Button delete = new Button("Delete");

    public ServiceRequestFollowUpForm(MshenguMain app) {
        setSizeFull();
        this.main = app;
        bean = new ServiceRequestFollowUpBean();
        item = new BeanItem<>(bean);
        binder = new FieldGroup(item);
        HorizontalLayout buttons = getButtons();
        buttons.setSizeFull();
        // Determines which properties are shown
        update.setVisible(false);
        delete.setVisible(false);

        // UIComponent

        ComboBox status = UIComboBox.getServiceRequesttatusComboBox("Status :", "status", ServiceRequestFollowUpBean.class, binder);
        DateField resolvedDate = UIComponent.getDateField("Resolved Date:", "resolvedDate", ServiceRequestFollowUpBean.class, binder);
        TextArea comment = UIComponent.getTextArea("Remarks:", "comment", ServiceRequestFollowUpBean.class, binder);
        comment.addValidator(new BeanValidator(ServiceRequestFollowUpBean.class, "comment"));
        DateField actionDate = UIComponent.getDateField("Reported On:", "actionDate", ServiceRequestFollowUpBean.class, binder);
        DateField qualityAssuranceDate = UIComponent.getDateField("Quality Assurance Date:", "qualityAssuranceDate", ServiceRequestFollowUpBean.class, binder);





        GridLayout grid = new GridLayout(4, 10);
        grid.setSizeFull();


        grid.addComponent(status, 0, 0);
        grid.addComponent(resolvedDate, 1, 0);
        grid.addComponent(comment, 0, 1);
        grid.addComponent(qualityAssuranceDate, 1, 1);


//        grid.addComponent(new Label("<hr/>", ContentMode.HTML), 0, 5, 2, 5);
//        grid.addComponent(buttons, 0, 6, 2, 6);
//        grid.addComponent(new Label("<hr/>", ContentMode.HTML), 0, 7, 2, 7);


        addComponent(grid);
    }

    private HorizontalLayout getButtons() {
        HorizontalLayout buttons = new HorizontalLayout();
        save.setSizeFull();
        edit.setSizeFull();
        cancel.setSizeFull();
        update.setSizeFull();
        delete.setSizeFull();
        back.setSizeFull();

        save.setStyleName("default");
        edit.setStyleName("default");
        cancel.setStyleName("default");
        update.setStyleName("default");
        delete.setStyleName("default");
        back.setStyleName("default");



        buttons.addComponent(save);
        buttons.addComponent(edit);
        buttons.addComponent(cancel);
        buttons.addComponent(update);
        buttons.addComponent(delete);
        buttons.addComponent(back);
        return buttons;
    }
}*/
