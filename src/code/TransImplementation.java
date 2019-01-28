package code;
/**
 * 
 * @author Ademovic Azra
 * This class serves for checking target and source account , also for cheking is there enough money for transaction.
 *
 */
public class TransImplementation extends Transactions {
	private static boolean sourceexist = false;
	private static boolean targetexist = false;
	private static boolean enough = false;
/**
 * 
 * @return boolean
 */
	public static boolean isSourceexist() {
		return sourceexist;
	}

	public static boolean isTargetexist() {
		return targetexist;
	}

	public static boolean isEnough() {
		return enough;
	}
	/**
	 * The method checks the accuracy of source account.
	 */

	public static void checkSource() {
		sourceexist = false;

		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getnumberOfAccount() == sourceAccount) {
				sourceexist = true;
			}
		}
		if (!sourceexist) {
			System.out.println("This account does not exist.");

		}

	}
	/**
	 * The method checks the accuracy of target account.
	 */

	public static void checkTarget() {
		targetexist = false;
		for (int j = 0; j < accounts.size(); j++) {

			if (accounts.get(j).getnumberOfAccount() == targetAccount) {
				targetexist = true;
			}
		}
		if (!targetexist) {

			System.out.println("The target account does not exist.");
		}
	}
	/**
	 * The method checks the balance of source account.
	 */

	public static void checkMoney() {
		enough = false;
		for (int k = 0; k < accounts.size(); k++) {

			if ((accounts.get(k).getAccountBalance() - sumMoney) >= 0) {
				enough = true;
			}
		}
		if (!enough) {
			System.out.println("You do not have enough money on your bank account.");
		}
	}
	/**
	 * 
	 * @return boolean
	 */

	public static boolean check() {

		checkSource();
		checkTarget();
		checkMoney();

		if (sourceexist && targetexist && enough) {
			return true;
		}

		else
			return false;
	}
	/**
	 * The method manages transactions.
	 */

	public static void doTransaction() {
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getnumberOfAccount() == targetAccount)
				accounts.get(i).accountBalance += sumMoney;

			if (accounts.get(i).getnumberOfAccount() == sourceAccount)
				accounts.get(i).accountBalance -= sumMoney;
		}

	}

}
