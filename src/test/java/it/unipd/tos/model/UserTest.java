package it.unipd.tos.model;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

	private User user;

	@Before
	public void setup() {
		user = new User("Davide","Porporati",21);
	}

	@Test
	public void getNameTest() {
		assertEquals("Davide", user.getName());
	}

	@Test
	public void getSurnameTest() {
		assertEquals("Porporati", user.getSurname());
	}

	@Test
	public void getAgeTest() {
		assertEquals(21, user.getAge());
	}

	@Test
	public void invalidAgeTest() {
		boolean b = true;
		if(user.getAge()<0)
			b = false;
		assertEquals(true, b);
	}
} 