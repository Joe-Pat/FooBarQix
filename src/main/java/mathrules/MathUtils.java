package main.java.mathrules;

public class MathUtils {
	
	/**
	 * Finds out if an Integer is divisible by 3
	 * @param nbToTest
	 * @return boolean
	 */
	public static Boolean isDivisibleBy3(Integer nbToTest) {
		return isDivisibleBy(nbToTest,3);
	}

	/**
	 * Finds out if an Integer is divisible by 5
	 * @param nbToTest
	 * @return boolean
	 */
	public static Boolean isDivisibleBy5(Integer nbToTest) {
		return isDivisibleBy(nbToTest,5);
	}

	/**
	 * Finds out if an Integer is divisible by 7
	 * @param nbToTest
	 * @return boolean
	 */
	public static Boolean isDivisibleBy7(Integer nbToTest) {
		return isDivisibleBy(nbToTest,7);
	}
	
	/**
	 * Finds out if an Integer is divisible by a divider
	 * @param nbToTest
	 * @param divider
	 * @return boolean
	 */	
	private static Boolean isDivisibleBy(Integer nbToTest, int divider) {
		return nbToTest % divider == 0;
	}
}
