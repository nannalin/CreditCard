package sample.junit;

public class CreditcardDisplay {
	public static String mask(String creditcardNumber) {
		
		if (creditcardNumber == null) {
			throw new IllegalArgumentException("Please provide a credit card number!");
		}
		return "xxxxxxxxxxxx" + creditcardNumber.substring(creditcardNumber.length() - 4);
	}
}
