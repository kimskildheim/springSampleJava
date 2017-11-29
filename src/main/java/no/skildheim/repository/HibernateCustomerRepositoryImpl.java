package no.skildheim.repository;

import no.skildheim.model.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUsername}")
    private String dbUsername;

    @Override
    public List<Customer> findAll(){
        System.out.println(dbUsername);
        List<Customer> customers = new ArrayList<>();
        Customer customer = new Customer();

        customer.setFirstname("Kim");
        customer.setLastname("Skildheim");

        customers.add(customer);

        return customers;
    }

}
