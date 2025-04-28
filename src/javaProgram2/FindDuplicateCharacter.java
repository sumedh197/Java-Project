package javaProgram2;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateCharacter {

	public static void main(String[] args) {

		String str = "seleniummmiiiee";

		char words[] = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char word : words) {

			if (hm.containsKey(word)) {

				hm.put(word, hm.get(word) + 1);

			} else {

				hm.put(word, 1);
			}

		}

		Set<Character> entry = hm.keySet();

		for (char key : entry) {

			if (hm.get(key) > 1) {

				System.out.println(key+" " + hm.get(key));

			}
		}

	}

}
