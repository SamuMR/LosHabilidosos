package los.habilidosisimos.habil2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import los.habilidosisimos.habil2.model.CurrentSession;
import los.habilidosisimos.habil2.model.User;
import los.habilidosisimos.habil2.repository.CurrentSessionRepository;
import los.habilidosisimos.habil2.repository.UserRepository;


@SpringBootApplication
public class Habil2Application {

	public static void main(String[] args) {	
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Habil2Application.class, args);

		//SpringApplication.run(Habil2Application.class, args);

		UserRepository userRepository = configurableApplicationContext.getBean(UserRepository.class);
		User user = new User("Gustavo", "Cabrera", "aaa@gmail.com", "password");
		userRepository.save(user);

		CurrentSessionRepository csr = configurableApplicationContext.getBean(CurrentSessionRepository.class);
		CurrentSession cs = new CurrentSession(false,"");
		csr.save(cs);
		}
}
