package com.workshop.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.springboot.exception.BusinessException;
import com.workshop.springboot.model.Person;
import com.workshop.springboot.repository.PersonRepository;

@Service
public class PersonService {


	@Autowired
	private PersonRepository personRepository;

	public Person create(final Person person) {
		
		final Person personExists = personRepository.findByCpf(person.getCpf());
		if (personExists != null) {
			throw new BusinessException ("CPF must be unique");
		} 
		
		return this.personRepository.insert(person);
	}
	
	public Person findByCpf (final String cpf ) {
		return this.personRepository.findByCpf(cpf);
		
	}
}
 