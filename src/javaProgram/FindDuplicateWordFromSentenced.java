package javaProgram;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateWordFromSentenced {

	public static void main(String[] args) {

		String str = "my name is sumedh sumedh is";

		String[] words = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String word : words) {

			if (hm.containsKey(word)) {

				hm.put(word, hm.get(word) + 1);

			} else {

				hm.put(word, 1);
			}
		}
		System.out.println(hm);
		System.out.println(hm);

		Set<String> entry = hm.keySet();

		for (String key : entry) {

			if (hm.get(key) > 1) {

				System.out.println(key + " " + hm.get(key));
			}

		}

	}

}
