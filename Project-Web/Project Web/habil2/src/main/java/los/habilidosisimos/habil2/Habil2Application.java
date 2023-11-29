package los.habilidosisimos.habil2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import los.habilidosisimos.habil2.entity.Sesion;
import los.habilidosisimos.habil2.repository.SesionRepository;



@SpringBootApplication
public class Habil2Application {

	public static void main(String[] args) {	
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(Habil2Application.class, args);

		//SpringApplication.run(Habil2Application.class, args);

		SesionRepository sesionRepository = configurableApplicationContext.getBean(SesionRepository.class);
		Sesion sesion = new Sesion(null, false);
		sesionRepository.save(sesion);
	}
}