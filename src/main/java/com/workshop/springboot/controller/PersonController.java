package com.workshop.springboot.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.springboot.model.Address;
import com.workshop.springboot.model.Person;
import com.workshop.springboot.service.PersonService;


@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping("/create")
	public ResponseEntity<Person> create(@RequestBody @Valid final Person person) {
		person.setId(null);
		return new ResponseEntity<Person>(this.personService.create(person), HttpStatus.CREATED);
	}
	
	@GetMapping("{cpf}")
	public ResponseEntity<Person> findByCpf (@PathVariable(name = "cpf", required = false) String cpf) {
		final Person person = this.personService.findByCpf(cpf);
		
		if (person == null) {
			return  new ResponseEntity<Person>(HttpStatus.NOT_FOUND); 
		} else {			
			return new ResponseEntity<Person> (person, HttpStatus.OK);		
		}
	}
	@GetMapping("/address/{cpf}")
	public ResponseEntity<Address> findAddressByCpf (@PathVariable(name = "cpf", required = false) String cpf) {
		final Person person = this.personService.findByCpf(cpf);
		
		if (person == null) {
			return  new ResponseEntity<Address>(HttpStatus.NOT_FOUND); 
		} else {			
			return new ResponseEntity<Address> (person.getAddress(), HttpStatus.OK);		
		}
	}
	
}