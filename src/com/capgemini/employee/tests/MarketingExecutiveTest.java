package com.capgemini.employee.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.employee.model.MarketingExecutive;


public class MarketingExecutiveTest {
		

		private MarketingExecutive executive;	
		@Before
		public void setUp() {
			executive=new MarketingExecutive(103,"Akshay",50000,3000,40);
		}


		@Test
		public void testMarketingObjectIsCreatedWithDefaultContructor() {
			MarketingExecutive executive =new MarketingExecutive();
			assertNotNull(executive);
		}
		@Test
		public void testMarketingObjectIsCreatedWithParametirizedConstructor() {
			assertEquals(103, executive.getEmployeeId());
			assertEquals("Akshay", executive.getEmployeeName());
			assertEquals(50000.0, executive.getEmployeeBasicSalary());
			assertEquals(3000, executive.getEmployeeMedical());
			assertEquals(40, executive.getDistanceTravelled());
		}
		@Test
		public void testMarketingGrossSalary(){
			assertEquals(79700,executive.getEmployeeGrossSalary());
			
		}
		@Test
		public void testMarketingNetSalary() {
			assertEquals(73500, executive.getEmployeeNetSalary());
		}
}	
