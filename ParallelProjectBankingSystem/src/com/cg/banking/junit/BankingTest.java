package com.cg.banking.junit;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.banking.dao.BankingDaoImpl;

public class BankingTest {
	static BankingDaoImpl BankingDao = null;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BankingDao = new BankingDaoImpl();
		System.out.println("...Start Class...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("...End Class...");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("...Test Function Start...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("...Test Function End...");
	}

	@Test
	public void testSignIn() {
		Assert.assertNotNull(BankingDao.signIn("162197", "me123"));
	}

	@Test
	public void testCreateAcc() {
		Assert.assertNotNull(BankingDao.createAccount("me123", "Meghna",
				"Current"));
	}

	@Test
	public void testFundTransfer() {
		Assert.assertNotNull(BankingDao.transfer(2000,
				BankingDao.signIn("162197", "meg123"), "160928"));
	}
}
