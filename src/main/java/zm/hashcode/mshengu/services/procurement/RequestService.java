/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.services.procurement;

import java.util.Date;
import java.util.List;
import zm.hashcode.mshengu.domain.fleet.Truck;
import zm.hashcode.mshengu.domain.procurement.Request;
import zm.hashcode.mshengu.domain.serviceprovider.ServiceProvider;
import zm.hashcode.mshengu.domain.ui.util.CostCentreType;

/**
 *
 * @author Luckbliss
 */
public interface RequestService {

    public List<Request> findAll();

    public void persist(Request request);

    public void merge(Request request);

    public Request findById(String id);

    public Request findByOrderNumber(String id);

    public List<Request> findByMisMatchStatus();

    public List<Request> findByServiceProvider(String id);

    public void delete(Request request);

    public List<Request> getTransactedRequestsBtnTwoDates(Date start, Date end);

    public List<Request> getTransactedRequestsByTruckBtnTwoDates(Truck truck, Date start, Date end);

    public List<Request> getTransactedRequestsByTruckByMonth(Truck truck, Date month);

    public List<Request> getTransactedRequestsByServiceProviderBtnTwoDates(ServiceProvider sericeProvider, Date start, Date end);

    public List<Request> getTransactedRequestsByServiceProviderByMonth(ServiceProvider serviceProvider, Date month);

    public List<Request> getTransactedRequestsByServiceProvider(ServiceProvider serviceProvider);

    public List<Request> getProcessedRequestsWithInvoiceNumber();

    public List<Request> getServiceProviderProcessedRequestsWithInvoiceNumber(String serviceProviderId);

    public List<Request> getProcessedRequestsWithPaymentDate(Date month);

    public List<Request> getServiceProviderProcessedRequestsWithPaymentDate(String serviceProviderId, Date month);

    public List<Request> getProcessedRequestsByCostCentreType(CostCentreType costCentreType, Date month);
}
