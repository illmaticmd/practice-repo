package com.fdmgroup;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SandwichDaoTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	SandwichDao dao = new JdbcSandwichDao();
	
	@Test
	public void test_ifSandwichDao_canReadSandwichFromDatabase() {
		
		String sandwichName = "PBJ";
		String expectedBread = "Pie";

		
		Sandwich sandwich = dao.readSandwich(sandwichName);
		
		assertEquals(expectedBread, sandwich.getBread());
	}
	
	@Test
	public void test_ifSandwichDao_canWriteReadAndDeleteSandwichFromDatabase() {
		String sandwichName = "Tomato Sandwich";
		String bread = "Sourdough";
		Sandwich sandwich = new Sandwich();
		sandwich.setName(sandwichName);
		sandwich.setBread(bread);
		
		Sandwich readSandwich = dao.readSandwich(sandwichName);		
		assertNull(readSandwich);
		
		dao.write(sandwich);
		readSandwich = dao.readSandwich(sandwichName);		
		assertEquals(sandwich, readSandwich);
		
		Set<Sandwich> sandwiches = dao.readAll();
		assertTrue(sandwiches.contains(sandwich));
		Sandwich pbj = new Sandwich();
		pbj.setName("PBJ");
		pbj.setBread("Pie");
		assertTrue(sandwiches.contains(pbj));
		
		
		dao.delete(sandwichName);
		readSandwich = dao.readSandwich(sandwichName);
		assertNull(readSandwich);
		
		
	}

}
