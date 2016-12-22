

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.pluralsight.service.CustomerService;
import com.pluralsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({"com.pluralsight"})
@PropertySource("app.properties")
public class AppConfig {

	@Bean(name="customerService")
	public CustomerService getCustomerService(){
		CustomerService service = new CustomerServiceImpl();
		//service.setCustomerRepository(getCustomerRepository());
		return service;
	}
	
	//Below bean puts all the property files from src/main/resources in context of the application to use.
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceHolderConfigurer(){
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	/*@Bean(name="customerRepository")
	public CustomerRepository getCustomerRepository(){
		return new HibernateCustomerRepositoryImpl();
	}*/
}
