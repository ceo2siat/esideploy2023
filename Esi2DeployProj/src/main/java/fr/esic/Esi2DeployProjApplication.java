package fr.esic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.esic.entities.Person;
import fr.esic.repository.PersonRepository;

@SpringBootApplication
public class Esi2DeployProjApplication implements CommandLineRunner {
	
	@Autowired
	private PersonRepository personRepos;

	public static void main(String[] args) {
		SpringApplication.run(Esi2DeployProjApplication.class, args);
		
		System.out.println("lancement termiiné");
	}

	@Override
	public void run(String... args) throws Exception {
		Person p1 = new Person(null, "JORDAN", "Mikel");
		Person p2 = new Person(null, "FOKA", "Alain");
		personRepos.save(p1);
		personRepos.save(p2);
	}

}
