/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.app.facade.procurement;

import zm.hashcode.mshengu.app.conf.SpringContext;
import zm.hashcode.mshengu.services.procurement.RequestService;

/**
 *
 * @author Luckbliss
 */
public class RequestFacade {

    private final static SpringContext ctx = new SpringContext();

    public static RequestService getRequestService() {
        return ctx.getBean(RequestService.class);
    }
}
