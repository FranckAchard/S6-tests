package co.simplon.test;

public class FizzBuzz {
	public static String fizzBuzz(int min, int max) {
		String res = "";
		if (min == 0 && max == 0) {
			res = "0";
		} else {
			for (int i=min ; i <= max ; i++) {
//				Integer integ = new Integer(i);
//				res += integ.toString();
				res += i;
			}
		}
		return res;
	}

}
