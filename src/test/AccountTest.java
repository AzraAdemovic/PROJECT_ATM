package test;
import static org.junit.Assert.*;
import code.Account;
import code.FirstPage;

import org.junit.Before;
import org.junit.Test;

public class AccountTest {

	Account account;

	@Before

	public void setUp() {

		account = new Account(1234564, "s", 50);

		FirstPage.accounts.add(account);

	}

	@SuppressWarnings("static-access")
	@Test

	public void shouldReturnTrueIfCorrectAccountNumber() {

		assertTrue(account.checkBalance(1234564));

	}

	@SuppressWarnings("static-access")
	@Test

	public void shouldReturnFalseIfInorrectAccountNumber() {

		assertFalse(account.checkBalance(3584564));

	}

}
