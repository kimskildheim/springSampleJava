package no.skildheim.service;

import no.skildheim.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
