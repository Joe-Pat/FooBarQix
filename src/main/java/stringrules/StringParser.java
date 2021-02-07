package main.java.stringrules;

/**
 * Class used to parse the string as per the expected rules.
 * 
 *
 */
public class StringParser {
	
	/**
	 * iterates through the characters of the number to encode them accordingly.
	 * @param stringToEncode
	 * @return
	 */
	public String encodeString(String stringToEncode) {
		String result = "";
		for(char c : stringToEncode.toCharArray()) {
			if (StringUtils.is3(c)) {
				result += "Foo";
			} else if (StringUtils.is5(c)) {
				result += "Bar";
			} else if (StringUtils.is7(c)) {
				result += "Qix";
			}
		}
		return result;
	}
}
