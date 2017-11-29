package no.skildheim;

import no.skildheim.repository.CustomerRepository;
import no.skildheim.repository.HibernateCustomerRepositoryImpl;
import no.skildheim.service.CustomerService;
import no.skildheim.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan({"no.skildheim"})
@PropertySource("app.properties")
public class AppConfig {

    @Bean
    public static PropertySourcesPlaceholderConfigurer getPropertySourcePlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }

  //   @Bean(name = "customerService")
  //  public CustomerService getCustomerService(){

        //Constructor injection
        //CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());

        // Setter injection
   //     CustomerServiceImpl customerService =  new CustomerServiceImpl();
        // customerService.setCustomerRepository(getCustomerRepository());
    //    return customerService;
   // }

   // @Bean (name = "customerRepository")
   // public CustomerRepository getCustomerRepository(){
   //     return new HibernateCustomerRepositoryImpl();
    //}
}
