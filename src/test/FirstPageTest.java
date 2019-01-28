package test;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import code.Account;
import code.FirstPage;
import code.TransImplementation;
import code.Transactions;

public class FirstPageTest {

	Account acc1;
	Transactions transaction, transaction1;
	TransImplementation trans, trans1;

	@Before
	public void setUp() {
		acc1 = new Account(23354, "r", 54);
		FirstPage.accounts.add(acc1);
	}

	@Test

	public void shouldReturnArrayList() {
		FirstPage.readFromFile();
		assertNotNull(FirstPage.accounts);

	}

	@Test

	public void shouldReturnTrueIfAccNoIsAvailable() {
		assertTrue(FirstPage.accountavaliable(233548));

	}

	@Test

	public void shouldReturnFalseIfAccNoIsNotAvailable() {
		assertFalse(FirstPage.accountavaliable(23354));
	}

	
	@Test

    public void shouldReturnTrue() {

	Account source = new Account(12345, "ja ", 20.00);
	Account target = new Account(54321, "neko", 10.00);
	
	@SuppressWarnings("unused")
	Transactions transaction = new Transactions(12345, 54321, 20.00);
	
	@SuppressWarnings("unused")
	TransImplementation trans = new TransImplementation();
	FirstPage.accounts.add(source);
	FirstPage.accounts.add(target);
	FirstPage.accounts.get(0).setAccountBalance(20);
	FirstPage.doTransferIfPossible();

	assertTrue(FirstPage.doTransferIfPossible());

    }
	
	@Test

    public void shouldReturnFalse() {

	Account source1 = new Account(12345, "ja ", 20.00);
	Account target1 = new Account(54321, "neko", 10.00);

	@SuppressWarnings("unused")
	Transactions transaction1 = new Transactions(12345, 542321, 20.00);

	@SuppressWarnings("unused")
	TransImplementation trans1 = new TransImplementation();

	FirstPage.accounts.add(source1);
	FirstPage.accounts.add(target1);
	FirstPage.accounts.get(1).setAccountBalance(10);
	assertFalse(FirstPage.doTransferIfPossible());

    }
	
	

	
	
}
