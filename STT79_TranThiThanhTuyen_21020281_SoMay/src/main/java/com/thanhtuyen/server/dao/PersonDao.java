package com.thanhtuyen.server.dao;


import java.util.List;

import com.thanhtuyen.server.entity.Gender;
import com.thanhtuyen.server.entity.Person;

public interface PersonDao{
	List<Person> findAll();
	Person save(Person person);
	Person findById(int id);
	List<Person> findByGender(Gender gender);
	List<Person> findByGenderAndManager(Gender gender, int manager);
}
