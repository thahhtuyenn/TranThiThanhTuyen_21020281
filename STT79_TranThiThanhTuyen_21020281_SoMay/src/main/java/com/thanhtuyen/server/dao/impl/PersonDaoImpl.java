package com.thanhtuyen.server.dao.impl;

import java.util.List;

import com.thanhtuyen.server.dao.PersonDao;
import com.thanhtuyen.server.entity.Gender;
import com.thanhtuyen.server.entity.Person;
import com.thanhtuyen.server.utils.AppUtils;

import jakarta.persistence.EntityManager;

public class PersonDaoImpl implements PersonDao{

	@Override
	public List<Person> findAll() {
		try(EntityManager em = AppUtils.getEntityManager()){
			return em.createQuery("SELECT p FROM Person p").getResultList();
		}
	}

	@Override
	public Person save(Person person) {
		try(EntityManager em = AppUtils.getEntityManager()){
			em.getTransaction().begin();
			em.persist(person);
			em.getTransaction().commit();
			return em.find(Person.class, person.getId());
		}
	}

	@Override
	public Person findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByGender(Gender gender) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Person> findByGenderAndManager(Gender gender, int manager) {
		// TODO Auto-generated method stub
		return null;
	}

}
