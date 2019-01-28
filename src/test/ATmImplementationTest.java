package test;
import static org.junit.Assert.*;
import code.ATmImplementation;
import code.Account;
import code.FirstPage;


import org.junit.Test;

public class ATmImplementationTest {

	ATmImplementation atm = new ATmImplementation();

	double accountBalance = 20;
	double balance = -1;

	int sum = 10;
	int numberOfAccount = 1234;
	String name = "Azra";
	String password = "azra1234";
	String password1 = "azra";
	String password2 = "$sun";
	String name1 = "12a3";

	@Test
	public void incraseBalanceTest() {
		atm.setAccountBalance(20);
		atm.increasBalance(sum);
		assertEquals(30, atm.getAccountBalance(), 4);

	}

	@Test
	public void decreaseBalanceTest() {
		atm.setAccountBalance(20);
		atm.decreasBalance(sum);
		assertEquals(10, atm.getAccountBalance(), 4);

	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnTrueWhenNameIsValide() {
		atm.validName(name);
		assertTrue(atm.validName(name));

	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnFalseWhenNameiSnotValide() {
		atm.validName(name1);
		assertFalse(atm.validName(name1));

	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnTrueWhenPasswordIsValide() {
		atm.validPassword(password);
		assertTrue(atm.validPassword(password));

	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnFalseWhenPasswordHasSigns() {
		atm.validPassword(password2);
		assertFalse(atm.validPassword(password2));

	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnFalseWhenPasswordIsinccorect() {
		atm.validPassword(password1);
		assertFalse(atm.validPassword(password1));
	}

	@SuppressWarnings("static-access")
	@Test
	public void validBalanceTest() {

		atm.setAccountBalance(accountBalance);
		assertTrue(atm.validBalance(accountBalance));
	}

	@SuppressWarnings("static-access")
	@Test
	public void InvalidBalanceTest() {

		atm.setAccountBalance(balance);
		assertFalse(atm.validBalance(balance));

	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnTrueWhenAccountExist() {
		Account xy = new Account(12345, "ja ", 20.00);
		FirstPage.accounts.add(xy);
		assertTrue(atm.printoutsOfAccounts(FirstPage.accounts.get(0).getnumberOfAccount()));
	}

	@SuppressWarnings("static-access")
	@Test
	public void shouldReturnFalseWhenAccountDoesNotExist() {

		assertFalse(atm.printoutsOfAccounts(numberOfAccount));

	}
}
