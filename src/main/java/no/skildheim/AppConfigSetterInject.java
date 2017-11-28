package no.skildheim;

import no.skildheim.repository.CustomerRepository;
import no.skildheim.repository.HibernateCustomerRepositoryImpl;
import no.skildheim.service.CustomerService;
import no.skildheim.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfigSetterInject {

    @Bean(name = "customerService")
    public CustomerService getCustomerService(){

        // Setter injection
        CustomerServiceImpl customerService =  new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
    }

    @Bean (name = "customerRepository")
    public CustomerRepository getCustomerRepository(){
        return new HibernateCustomerRepositoryImpl();
    }
}
