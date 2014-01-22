/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package zm.hashcode.mshengu.services.serviceprovider.impl;

import com.google.gwt.thirdparty.guava.common.collect.ImmutableList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import zm.hashcode.mshengu.domain.serviceprovider.ServiceProviderCategory;
import zm.hashcode.mshengu.repository.serviceprovider.ServiceProviderCategoryRepository;
import zm.hashcode.mshengu.services.serviceprovider.ServiceProviderCategoryService;

/**
 *
 * @author Ferox
 */
@Service
public class ServiceProviderCategoryServiceImpl implements ServiceProviderCategoryService {

    @Autowired
    private ServiceProviderCategoryRepository repository;

    @Override
    public List<ServiceProviderCategory> findAll() {
        return ImmutableList.copyOf(repository.findAll(sortByName()));
    }

    @Override
    public void persist(ServiceProviderCategory serviceProviderCategory) {

        repository.save(serviceProviderCategory);

    }

    @Override
    public void merge(ServiceProviderCategory serviceProviderCategory) {
        if (serviceProviderCategory.getId() != null) {
            repository.save(serviceProviderCategory);
        }
    }

    @Override
    public ServiceProviderCategory findById(String id) {
        return repository.findOne(id);
    }

    @Override
    public void delete(ServiceProviderCategory serviceProviderCategory) {
        repository.delete(serviceProviderCategory);
    }

    private Sort sortByName() {
        return new Sort(
                new Sort.Order(Sort.Direction.ASC, "categoryName"));
    }
    
    @Override
    public ServiceProviderCategory findByCategoryName(String categoryName){
        return repository.findByCategoryName(categoryName);
    }
}
