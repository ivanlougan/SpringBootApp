package pl.rob.springrelationonetoone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.rob.springrelationonetoone.model.Address;
import pl.rob.springrelationonetoone.model.User;
import pl.rob.springrelationonetoone.repository.AddressRepository;
import pl.rob.springrelationonetoone.repository.UserRepository;

@SpringBootApplication
public class SpringRelationOnetooneApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(SpringRelationOnetooneApplication.class, args);
		AddressRepository addressRepository =
				configurableApplicationContext.getBean(AddressRepository.class);
		UserRepository userRepository =
				configurableApplicationContext.getBean(UserRepository.class);

		Address address = new Address("London Road");
		addressRepository.save(address);

		User user = new User("Robek Zdebek" ,29, address);
		userRepository.save(user);
	}

}
