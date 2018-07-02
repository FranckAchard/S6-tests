package co.simplon.test;

public class CamelCase {
	public static String camelCase(String str) {
		String res = "";
		if (str != null) {
			// on decoupe la chaine en tableau de chaines en passant les caracteres separateurs en expression reguliere 
			for (String wd : str.split("[_-]")) {
				res += camelCaseOneWord(wd);
			}
		}
		else {
			res = "null!";
		}

		return res;
	}
	
	private static String camelCaseOneWord(String word) {
		// mettre la 1e lettre en majuscule et les suivantes en minuscules
		return Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
	}
}
