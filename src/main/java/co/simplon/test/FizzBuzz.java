package co.simplon.test;

//import java.util.ArrayList;
//import java.util.List;

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
	
/*
	// liste les diviseurs d'un entier
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
	
	// indique si integ est divisible par divisor
	private static boolean isNDivisible(int integ, int divisor) {
		boolean res = false;
		if (listDivisors(integ).contains(divisor)) {
			res = true;
		}
		return res;
	}
*/	
	// FizzBuzz un entier 
	private static String setFizzBuzz(int integ) {
		String res="";
		// on teste en 1er multiple de 15 car 15 est aussi divisible par 3 et 5
/*		if (isNDivisible(integ, 15)) {
			res = "FizzBuzz";
		}
		else if (isNDivisible(integ, 5)) {
			res = "Buzz";
		}
		else if(isNDivisible(integ, 3)) {
			res = "Fizz";
		}
		else {
			res = "" + integ;
		}*/
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
