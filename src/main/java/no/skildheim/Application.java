package no.skildheim;

import no.skildheim.service.CustomerService;
import no.skildheim.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sun.awt.AppContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CustomerService service = applicationContext.getBean("customerService", CustomerService.class);

        System.out.println(service.findAll().get(0).getFirstname());
    }
}