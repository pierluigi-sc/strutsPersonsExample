package com.strutsDemo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.strutsDemo.model.Person;

public class PersonDao implements IPersonDao<Person>{

	private static List<Person> persons = new ArrayList<>();
	
	public PersonDao(){
		
	}
	
	@Override
	public Optional<Person> get(long id) {

		return Optional.ofNullable(persons.get((int) id));		
	}

	@Override
	public List<Person> getAll() {
		
		return persons;
	}

	@Override
	public void save(Person p) {
		
		persons.add(p);
	}

	@Override
	public void update(Person p, String[] params) {
		
		p.setId(Objects.requireNonNull(
		          params[0], "Id cannot be null"));
		p.setName(Objects.requireNonNull(
		          params[1], "Name cannot be null"));
		p.setPlace(Objects.requireNonNull(
		          params[2], "Place cannot be null"));
		p.setAge(Objects.requireNonNull(
		          params[3], "Age cannot be null"));
		
		persons.add(p);
		
	}

	@Override
	public void delete(Person p) {
		
		persons.remove(p);
	}

}
