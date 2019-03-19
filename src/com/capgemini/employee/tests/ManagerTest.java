package com.capgemini.employee.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Manager;


public class ManagerTest {
	

	private Manager manager;	
	@Before
	public void setUp() {
		manager=new Manager(102,"Ruchir",30000,2000);
	}


	@Test
	public void testManagerObjectIsCreatedWithDefaultContructor() {
		Manager manager=new Manager();
		assertNotNull(manager);
	}
	@Test
	public void testManagerObjectIsCreatedWithParametrizedContructor() {
		assertEquals(102, manager.getEmployeeId());
		assertEquals("Ruchir", manager.getEmployeeName());
		assertEquals(30000, manager.getEmployeeBasicSalary());
		assertEquals(2000, manager.getEmployeeMedical());
	}
	@Test
	public void testManagerGrossSalary() {
		assertEquals(54200.0,manager.getEmployeeGrossSalary());
	}
	@Test
	public void testManagerNetSalary() {
		assertEquals(50400.0,manager.getEmployeeNetSalary());
	}
}
