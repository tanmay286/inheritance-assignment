package com.capgemini.employee.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.Employee;

public class EmployeeTest {
	
	private Employee employee;	
	@Before
	public void setUp() {
		employee=new Employee(101,"Tanmay",20000,1000);
	}

	@Test
	public void testEmployeeObjectIsCreatedWithDefaultConstructor(){
		Employee employee=new Employee();
		assertNotNull(employee);
	}
	@Test
	public void testEmployeeObjectIsCreatedWithParatemrizedConstructor(){
		Employee employee=new Employee(101,"Tanmay",20000,1000);
		assertEquals(101, employee.getEmployeeId());
		assertEquals("Tanmay", employee.getEmployeeName());
		assertEquals(20000.0, employee.getEmployeeBasicSalary(),0.01);
		assertEquals(1000.0, employee.getEmployeeMedical(),0.01);
	}
	@Test
	public void testEmployeeGrossSalary(){
		assertEquals(31000, employee.getEmployeeGrossSalary(),0.01);
	}
	@Test
	public void testEmployeeNetSalary() {
		assertEquals(28400, employee.getEmployeeNetSalary(),0.01);
	}
}
