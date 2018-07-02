package co.simplon.test;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static String fizzBuzz(int min, int max) {
		String res = "";
		if (min == 0 && max == 0) {
			res = "0";
		} else {
			for (int i=min ; i <= max ; i++) {
//				Integer integ = new Integer(i);
//				res += integ.toString();
				if (isNMultiple(i, 3)) {
					res += "Fizz";
				}
				else if(isNMultiple(i, 5)) {
					res += "Buzz";
				}
				else {
					res += i;
				}
			}
		}
		return res;
	}
	
	private static List<Integer> listDivisors(int integ) {
		List<Integer> res = new ArrayList<Integer>();
		if (integ == 0) {
			res.add(0);
		} else {
			for (int i = 1 ; i <= integ ; i++) {
				// si le reste de la division de integ par i est nul, alors i est un diviseur de integ
				if (integ % i == 0) {
					res.add(i);
				}			
			}
		}
		return res;
	}

/*	private static boolean is3Multiple(int integ) {
		boolean res = false;
		if (listDivisors(integ).contains(3)) {
			res = true;
		}
		return res;
	}
	
	private static boolean is5Multiple(int integ) {
		boolean res = false;
		if (listDivisors(integ).contains(5)) {
			res = true;
		}
		return res;
	}*/
	
	private static boolean isNMultiple(int integ, int multiple) {
		boolean res = false;
		if (listDivisors(integ).contains(multiple)) {
			res = true;
		}
		return res;
	}

	
/*	private static int[] listDivisors(int integ) {
		int[] res = {};
		if (integ == 0) {
			res[0] = 0;
		} else {
			int j = 0;
			for (int i = 1 ; i <= integ ; i++) {
				// si le reste de la division de integ par i est nul, alors i est un diviseur de integ
				if (integ % i == 0) {
					res[j] = i;
					j++;
				}
			}			
		}
		return res;
	}*/
	
}
