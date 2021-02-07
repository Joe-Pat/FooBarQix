package main.java.application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import main.java.mathrules.MathParser;
import main.java.stringrules.StringParser;

public class FooBarQixApplication {
	
	public static void main(String[] args) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Integer:");
        String stringToEncode = br.readLine();
        System.out.println(compute(stringToEncode));
	}
	
	private static String compute(String stringToEncode) throws NumberFormatException {
		String result = new String("");
		try {
        	Integer intToEncode = Integer.parseInt(stringToEncode);
        	
    		MathParser mathParser = new MathParser();
    		StringParser stringParser = new StringParser();
    		
    		result += mathParser.encodeNumber(intToEncode);
    		if("".equals(result)) { //Rules are not clear about the digit adding.
    			result += stringToEncode;
    		}
    		result += stringParser.encodeString(stringToEncode); //Can be added in the condition, after rule clarification.
	    } catch(NumberFormatException nfe) {
	        System.err.println("Invalid format of number, input an Integer please!");
	        throw nfe;
	    }
		return result;
	}
}
