package co.simplon.test;

import java.util.List;

public class Smileys {

	public static int countSmileys(List<String> input) {
		// Counter
		int smilingFaces = 0;
		// List analysis
		for (String face : input) {
			// If smiley is smiling then counter++
			if (matchesSmiley(face))
				smilingFaces++;
		}
		return smilingFaces;
	}

	private static boolean matchesSmiley(String input) {
		return input.matches("[:;][-~]?[\\)D]");
	}
}
