package com.capgemini.bankapplication;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.bankapplicationmodel.AccountBank;
import com.capgemini.bankapplicationmodel.CurrentAccountBank;

public class CurrentAccountBankTest {
	
	private AccountBank account;
	
	@Before
	public void setUp()
	{
		account = new CurrentAccountBank(101, "John Doe", 45000, 10000);
	}
	
	@Test
	public void testCurrentBankAccountObjectIsCreated()
	{
		AccountBank account = new CurrentAccountBank();
		assertNotNull(account);
	}
	
	@Test
	public void testCurrentBankAccountObjectIsCreatedWithParameterized()
	{
		assertEquals(101, account.getAccountId());
		assertEquals("John Doe", account.getAccountHolderName());
		assertEquals(45000, account.getAccountBalance(),0.01);
		assertEquals(10000, ((CurrentAccountBank) account).getDebitLimit(),0.01);
		assertEquals(0, ((CurrentAccountBank) account).getBorrowedAmount(),0.01);
		
	}
	
	@Test
	public void testCurrentBankAccountWithdrawWithSufficientFund()
	{
		assertEquals(500, account.withdraw(44500),0.01);
	}
	
	@Test
	public void testCurrentBankAccountWithdrawWithFundWithinDebitLimit()
	{
		assertEquals(0, account.withdraw(51000),0.01);
		assertEquals(6000, ((CurrentAccountBank) account).getBorrowedAmount(), 0.01);
	}
	
	@Test
	public void testCurrentBankAccountWithdrawWithFundWithDebitLimitExceeded()
	{
		assertEquals(45000, account.withdraw(56000),0.01);
		assertEquals(0, ((CurrentAccountBank) account).getBorrowedAmount(), 0.01);
	}
	
	@Test
	public void testCurrentBankAccountDepositWithNoBorrowedAmount()
	{
		assertEquals(65000, account.deposit(20000),0.01);
	}
	
	@Test
	public void testCurrentBankAccountDepositWithAmountGreaterThanBorrowedAmount()
	{
		CurrentAccountBank account = new CurrentAccountBank(101, "John Doe", 45000, 10000);
		assertEquals(0, account.withdraw(47000),0.01);
		assertEquals(2000, account.getBorrowedAmount(),0.01);
		assertEquals(8000, account.deposit(10000),0.01);
	}
	
	@Test
	public void testCurrentBankAccountDepositWithAmountLessThanBorrowedAmount()
	{
		CurrentAccountBank account = new CurrentAccountBank(101, "John Doe", 45000, 10000);
		assertEquals(0, account.withdraw(47000),0.01);
		assertEquals(2000, account.getBorrowedAmount(),0.01);
		assertEquals(0, account.deposit(1000),0.01);
		assertEquals(1000, account.getBorrowedAmount(),0.01);
	}

}