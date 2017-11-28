package repository;

import no.skildheim.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll(){
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstname("Kim");
        customer.setLastname("Skildheim");

        customers.add(customer);

        return customers;
    }

}
