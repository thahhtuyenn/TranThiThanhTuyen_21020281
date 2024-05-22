package test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertAll;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.thanhtuyen.server.dao.PersonDao;
import com.thanhtuyen.server.dao.impl.PersonDaoImpl;
import com.thanhtuyen.server.entity.Person;

public class TestDao {
	private PersonDao personDao;
	
	@BeforeEach
	void setUp() {
		personDao = new PersonDaoImpl();
	}
	
	@Test
	void findAllTest() {
		List<Person> persons = personDao.findAll();
		assertTrue(persons.size() >= 0);
	}
}
