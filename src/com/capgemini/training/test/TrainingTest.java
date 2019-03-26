package com.capgemini.training.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.training.model.CorporateTraining;
import com.capgemini.training.model.PublicTraining;
import com.capgemini.training.model.Training;

public class TrainingTest {
	
	@Test
	public void toCheckOrderValueForPublic() {
		Training publicTraining = new PublicTraining(100,"Java",2000,50);
		assertEquals(100000, publicTraining.getOrderValue());
	}
	
	@Test
	public void toCheckOrderValueForCorporate() {
		Training corporateTraining = new CorporateTraining(100,"BigData",2500,5);
		assertEquals(12500, corporateTraining.getOrderValue());
		
	}
}
