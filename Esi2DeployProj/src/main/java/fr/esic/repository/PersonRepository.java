package fr.esic.repository;

import org.springframework.data.repository.CrudRepository;

import fr.esic.entities.Person;

public interface PersonRepository extends CrudRepository<Person, Long> {

}
