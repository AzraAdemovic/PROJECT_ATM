package code;
/**
 * 
 * @author Azra Ademoviæ
 * The class serves to create an account and check the account balance.
 *
 */

public class Account extends FirstPage {

	protected int numberOfAccount;
	private String name;
	protected double accountBalance;

	public Account() {
	}
	/**
	 * 
	 * @param numberOfAccount user's account number
	 * @param name user's name
	 * @param accountBalance balance on user's account
	 */

	public Account(int numberOfAccount, String name, double accountBalance) {
		this.numberOfAccount = numberOfAccount;
		this.name = name;
		this.accountBalance = accountBalance;
	}
	/**
	 * 
	 * @return numberOfccount , name , accountBalance
	 */

	public int getnumberOfAccount() {
		return numberOfAccount;
	}

	public void setNumberOfAccount(int numberOfAccount) {
		this.numberOfAccount = numberOfAccount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	/**
	 * 
	 * @param numberOfAccount user's number of account
	 * @return boolean
	 */

	public static boolean checkBalance(int numberOfAccount) {

		for (int i = 0; i < accounts.size(); i++) {

			if (accounts.get(i).numberOfAccount == numberOfAccount) {

				System.out.println(accounts.get(i).toString());

				return true;

			}

		}

		System.out.println("Account is incorrect.");

		return false;

	}
	

	@Override
	public String toString() {
		return "Account [\n numberOfAccount=" + numberOfAccount + "\n name=" + name + "\n accountBalance="
				+ accountBalance + "]";
	}
}
