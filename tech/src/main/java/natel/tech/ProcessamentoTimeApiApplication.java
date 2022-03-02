package natel.tech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;

@SpringBootApplication
public class ProcessamentoTimeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcessamentoTimeApiApplication.class, args);
	}


}
