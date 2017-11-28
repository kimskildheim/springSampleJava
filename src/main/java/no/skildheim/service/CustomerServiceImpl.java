package no.skildheim.service;

import no.skildheim.model.Customer;
import no.skildheim.repository.CustomerRepository;
import no.skildheim.repository.HibernateCustomerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService ")
@Scope("singleton")
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) //Alternative
public class CustomerServiceImpl implements CustomerService {

    //@Autowired //member injection
    private CustomerRepository customerRepository;

    public  CustomerServiceImpl() {
    }

    //Constructor injection
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("Constructor injection");
        this.customerRepository = customerRepository;
    }

    //Setter injection
    @Autowired //setter injection
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("Setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
