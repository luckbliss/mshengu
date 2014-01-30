/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.client.web.content.procurement.purchase.table;

import com.vaadin.ui.Button;
import com.vaadin.ui.Table;
import com.vaadin.ui.themes.Reindeer;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;
import zm.hashcode.mshengu.app.facade.procurement.RequestFacade;
import zm.hashcode.mshengu.client.web.MshenguMain;
import zm.hashcode.mshengu.client.web.content.procurement.purchase.form.SendPurchasePDFForm;
import zm.hashcode.mshengu.client.web.content.procurement.purchase.views.ApprovedRequestsTab;
import zm.hashcode.mshengu.domain.procurement.Request;
import zm.hashcode.mshengu.domain.procurement.RequestPurchaseItem;

/**
 *
 * @author Luckbliss
 */
public class ApprovedRequestsTable extends Table {

    private static ApprovedRequestsTab tab;
    private final MshenguMain main;

    public ApprovedRequestsTable(MshenguMain main, ApprovedRequestsTab tab) {
        ApprovedRequestsTable.tab = tab;
        this.main = main;

        addContainerProperty("Approver", String.class, null);
        addContainerProperty("PO Number", String.class, null);
        addContainerProperty("Purchasing Person", String.class, null);
        addContainerProperty("Company Name", String.class, null);
        addContainerProperty("Total", BigDecimal.class, null);
        addContainerProperty("Email Status", String.class, null);
        addContainerProperty("More Details", Button.class, null);

        setNullSelectionAllowed(false);
        setSelectable(true);
        // Send changes in selection immediately to server.
        setImmediate(true);
        setSizeFull();
        displayRequests(tab);
    }

    private void displayRequests(final ApprovedRequestsTab tab) {
        String message;
        if (RequestFacade.getRequestService().findAll() != null) {
            List<Request> requests = RequestFacade.getRequestService().findAll();
            for (Request request : requests) {
                if (request.isApprovalStatus()) {
                    Button showDetails = new Button("View PO");
                    showDetails.setData(request);
                    showDetails.setStyleName(Reindeer.BUTTON_LINK);
                    showDetails.setImmediate(true);
                    showDetails.addClickListener(new Button.ClickListener() {
                        @Override
                        public void buttonClick(Button.ClickEvent event) {
                            displayPDF(event.getButton().getData());
                        }
                    });
                    if (request.isEmailstatus()) {
                        message = "sent";
                    } else {
                        message = "not sent";
                    }
                    addItem(new Object[]{
                        request.getApprover(),
                        request.getOrderNumber(),
                        request.getPersonName(),
                        request.getServiceProviderName(),
                        request.getTotal(),
                        message,
                        showDetails,}, request.getId());
                    message = "";
                }
            }
        }
    }

    private void displayPDF(Object object) {
        Request requestt = (Request) object;
        tab.removeAllComponents();
        SendPurchasePDFForm form = new SendPurchasePDFForm(main, requestt, tab);
        tab.setImmediate(true);
        tab.addComponent(form);
    }
}
