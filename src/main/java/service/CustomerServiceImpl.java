package service;

import no.skildheim.model.Customer;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }
}
