package co.simplon.test;

public class FizzBuzz {
	public static String fizzBuzz(int min, int max) {
		String res = "";
		if ((min == 0 && max == 0) || (min > max)) {
			res = "0";
		} else {
			for (int i=min ; i <= max ; i++) {
				res += setFizzBuzz(i);
			}
		}
		return res;
	}
	
	// FizzBuzz un entier 
	private static String setFizzBuzz(int integ) {
		String res="";
		if (integ % 15 == 0) {
			res = "FizzBuzz";
		}
		else if (integ % 5 == 0) {
			res = "Buzz";
		}
		else if(integ % 3 == 0) {
			res = "Fizz";
		}
		else {
			res = "" + integ;
		}
		return res;
	}
	
}
