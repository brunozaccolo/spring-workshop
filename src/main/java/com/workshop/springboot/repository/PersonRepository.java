package com.workshop.springboot.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.workshop.springboot.model.Person;


public interface PersonRepository extends MongoRepository<Person, String> {

	public Person findOneByNameIgnoreCase(String cpf);
	
	public Person findByCpf (String cpf);
	

}
