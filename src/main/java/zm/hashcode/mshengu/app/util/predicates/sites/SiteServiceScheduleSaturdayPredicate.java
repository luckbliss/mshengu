package zm.hashcode.mshengu.app.util.predicates.sites;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import com.google.common.base.Predicate;
import zm.hashcode.mshengu.domain.products.Site;
import zm.hashcode.mshengu.domain.products.SiteServiceContractLifeCycle;

/**
 *
 * @author boniface
 */
public class SiteServiceScheduleSaturdayPredicate implements Predicate<Site> {

    @Override
    public boolean apply(Site site) {
       if (getLatestServiceContract(site)) {
            return true;
        }
        return false;
    }

    private boolean getLatestServiceContract(Site site) {
        if (site != null) {
            return isSaturdayVisitDay(site.getLastSiteServiceContractLifeCycle());
        }
        return false;
    }

    private boolean isSaturdayVisitDay(SiteServiceContractLifeCycle siteServiceContractLifeCycle) {
        if (siteServiceContractLifeCycle != null) {
            return siteServiceContractLifeCycle.isSaturday();
        }
        return false;
    }
}
