package test;
import static org.junit.Assert.*;
import code.Account;
import code.FirstPage;
import code.Transactions;
import code.TransImplementation;

import org.junit.Before;
import org.junit.Test;

public class TransImplementationTest {

	Transactions transaction, transaction1;
	TransImplementation trans, trans1;
	Account source;
	Account target;

	@Before

	public void setUp() {
		source = new Account(12345, "ja ", 20.00);
		target = new Account(54321, "neko", 10.00);
		transaction = new Transactions(12345, 54321, 20.00);
		trans = new TransImplementation();
		FirstPage.accounts.add(source);
		FirstPage.accounts.add(target);
	}

	@Test
	@SuppressWarnings("static-access")
	public void shouldReturnTrueWhenSourceAccountExist() {

		trans.checkSource();
		assertTrue(trans.isSourceexist());

	}

	@Test
	@SuppressWarnings("static-access")
	public void shouldReturnFalseWhenSourceAccountDoesNotExist() {
		transaction1 = new Transactions(12545, 87954, 10);
		trans1 = new TransImplementation();
		trans1.checkSource();
		assertFalse(trans1.isSourceexist());

	}

	@Test
	@SuppressWarnings("static-access")
	public void shouldReturnTrueWhenTargetAccountExist() {
		trans.checkTarget();
		assertTrue(trans.isTargetexist());

	}

	@Test
	@SuppressWarnings("static-access")
	public void shouldReturnFalseWhenTargetAccountDoesNotExist() {
		transaction1 = new Transactions(12545, 87954, 10);
		trans1 = new TransImplementation();
		trans1.checkTarget();
		assertFalse(trans1.isTargetexist());
	}

	@Test
	@SuppressWarnings("static-access")
	public void shouldReturnTrueWhenSourceAccountHasEnoughMoney() {
		trans.checkMoney();
		assertTrue(trans.isEnough());
	}

	@Test
	@SuppressWarnings("static-access")
	public void shouldReturnFalseWhenSourceAccountHasNotEnoughMoney() {
		transaction1 = new Transactions(5897, 56548, 1000);
		trans1 = new TransImplementation();
		trans1.checkMoney();
		assertFalse(trans1.isEnough());
	}

	@Test
	@SuppressWarnings("static-access")
	public void shouldReturnTrueWheneverythingIsTrue() {
		trans.check();

	}

	@SuppressWarnings("static-access")
	@Test

	public void shouldRemoveFromSource() {

		FirstPage.accounts.get(0).setAccountBalance(20);

		trans.doTransaction();

		assertEquals(0, FirstPage.accounts.get(0).getAccountBalance(), 4);

	}

	@SuppressWarnings("static-access")
	@Test

	public void shouldAddToTarget() {

		FirstPage.accounts.get(1).setAccountBalance(10);
		trans.doTransaction();
		assertEquals(30, FirstPage.accounts.get(1).getAccountBalance(), 4);

	}

	@SuppressWarnings("static-access")
	@Test

	public void check_shouldReturnFalseWhenSourceAccountHasNotEnoughMoney() {

		transaction1 = new Transactions(5897, 56548, 1000);
		trans1 = new TransImplementation();
		trans1.checkMoney();
		assertFalse(trans1.check());

	}

	@SuppressWarnings("static-access")
	@Test

	public void check_shouldReturnFalseWhenTargetAccountDoesNotExist() {

		transaction1 = new Transactions(12545, 87954, 10);

		trans1 = new TransImplementation();
		trans1.checkTarget();
		assertFalse(trans1.check());

	}

	@SuppressWarnings("static-access")
	@Test

	public void check_shouldReturnFalseWhenSourceAccountDoesNotExist() {

		transaction1 = new Transactions(12545, 87954, 10);
		trans1 = new TransImplementation();
		trans1.checkSource();
		assertFalse(trans1.check());

	}

	@SuppressWarnings("static-access")
	@Test

	public void check_shouldReturnFalseWhenSourceAndTargetAccountDoesNotExist() {

		transaction1 = new Transactions(12545, 87954, 10);
		trans1 = new TransImplementation();
		trans1.checkTarget();
		trans1.checkSource();
		assertFalse(trans1.check());

	}

	@SuppressWarnings("static-access")
	@Test

	public void check_shouldReturnFalseWhenSourceAccountAndMoneyDoesNotExist() {

		transaction1 = new Transactions(12545, 87954, 10);
		trans1 = new TransImplementation();
		trans1.checkMoney();
		trans1.checkSource();
		assertFalse(trans1.check());

	}

	@SuppressWarnings("static-access")
	@Test

	public void check_shouldReturnFalseWhenTargetAccountAndMoneyDoesNotExist() {

		transaction1 = new Transactions(12545, 87954, 10);
		trans1 = new TransImplementation();
		trans1.checkMoney();
		trans1.checkTarget();
		assertFalse(trans1.check());

	}

	@SuppressWarnings("static-access")
	@Test

	public void check_shouldReturnFalseWhenAllFalse() {

		transaction1 = new Transactions(12545, 87954, 10);
		trans1 = new TransImplementation();
		trans1.checkMoney();
		trans1.checkTarget();
		trans1.checkSource();
		assertFalse(trans1.check());

	}

}
