package main.java.mathrules;

/**
 * Class used to parse the integer as per the expected mathematical rules.
 *
 */
public class MathParser {

	/** 
	 * Function that transforms a string into the expected text based on mathematical rules only.
	 * @param string to encode
	 * @return encoded result
	 */
	public String encodeNumber(Integer integerToEncode) {
		String result = "";
		if (MathUtils.isDivisibleBy3(integerToEncode)) {
			result += "Foo";
		}
		if (MathUtils.isDivisibleBy5(integerToEncode)) {
			result += "Bar";
		}
		if (MathUtils.isDivisibleBy7(integerToEncode)) {
			result += "Qix";
		}
		return result;
	}
}
