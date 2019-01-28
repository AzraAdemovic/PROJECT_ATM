package code;
/**
 * 
 * @author Azra Ademoviæ
 *   The class shows some of the services that are provided. 
 *
 */

public class ATmImplementation extends Account {

	public void increasBalance(double sum) {
		accountBalance += sum;
	}

	public void decreasBalance(double sum) {
		accountBalance -= sum;
	}
	/**
	 * 
	 * @param numberOfAccount number of users account
	 * @return boolean
	 */

	public static boolean printoutsOfAccounts(int numberOfAccount) {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).numberOfAccount == numberOfAccount) {
				System.out.println(accounts.get(i).toString());
				return true;
			}
		}
		System.out.println("Account is incorrect.");
		return false;

	}
	/**
	 * 
	 * @param name  user's name
	 * @return boolean
	 */

	public static boolean validName(String name) {
		for (int i = 0; i < name.length(); i++) {
			if (!Character.isLetter(name.charAt(i))) {
				return false;
			}
		}

		return true;

	}
	/**
	 * 
	 * @param password password which allows acces to account
	 * @return boolean
	 */

	public static boolean validPassword(String password) {
		int counter = 0;
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetterOrDigit(password.charAt(i))) {
				return false;
			} else {
				counter++;
			}

		}
		if (counter >= 8) {
			System.out.println("Password is valid.");
			return true;
		} else {
			System.out.println("Password is not valid.");
			return false;
		}
	}
	/**
	 * 
	 * @param balance account balance
	 * @return boolean
	 */

	public static boolean validBalance(double balance) {
		if (balance >= 0) {
			return true;
		}
		return false;
	}
}
