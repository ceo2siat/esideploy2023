package fr.esic.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.esic.entities.Person;
import fr.esic.repository.PersonRepository;

@RestController @CrossOrigin("*")
public class PersonRest {

	@Autowired
	private PersonRepository personRepos;
	
	@GetMapping("person")
	public Iterable<Person> getAllPerson(){
		return personRepos.findAll();
	}
}
