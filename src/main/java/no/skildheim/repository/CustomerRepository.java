package no.skildheim.repository;

import no.skildheim.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
