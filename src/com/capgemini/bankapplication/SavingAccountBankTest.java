package com.capgemini.bankapplication;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankapplicationmodel.AccountBank;
import com.capgemini.bankapplicationmodel.SavingAccountBank;

public class SavingAccountBankTest {

	SavingAccountBank savingAccountBank;
	
	@Before
	public void setUp()
	{
		savingAccountBank=new SavingAccountBank(101,"Lahar N",20000,true);
	}
	
	@Test
	public void testSavingBankAccountObjectIsCreated() {
		//AccountBank savingBankAccount=new SavingAccountBank();
		assertNotNull(savingAccountBank);
	}
	
	@Test
	public void testSavingBankAccountObjectIsParamtaerizedCreated() {
		//AccountBank account=new SavingAccountBank();
		assertEquals(101, savingAccountBank.getAccountId());
		assertEquals("Lahar N", savingAccountBank.getAccountHolderName());
		assertEquals(20000, savingAccountBank.getAccountBalance());
		assertEquals(true,( (SavingAccountBank) savingAccountBank).isSalaryAccount());
	}
	@Test
	public void testSavingBankAccountWithdrawWithSalaryAccount()
	{
		assertEquals(18000, savingAccountBank.withdraw(2000));
	}
	
	@Test
	public void testSavingBankAccountWithdrawWithSalaryAccountWithInsufficientFund()
	{
		assertEquals(20000, savingAccountBank.withdraw(45001));
	}
	
	@Test
	public void testSavingBankAccountWithdrawWithNormalAccount()
	{
		AccountBank savingAccountBank = new SavingAccountBank(101, "Lahar N", 20000, false);
		assertEquals(6200, savingAccountBank.withdraw(13800),0.01);
	}
	@Test
	public void testSavingBankAccountWithdrawWithNormalAccountWithInsufficientFund()
	{
		AccountBank account = new SavingAccountBank(101, "Lahar N", 20000, false);
		assertEquals(20000, account.withdraw(24100),0.01);
	}
	
	@Test
	public void testSavingBankAccountDeposit()
	{
		AccountBank account = new SavingAccountBank(101, "Lahar N", 10000, false);
		assertEquals(30000, account.deposit(20000),0.01);
	}
}
