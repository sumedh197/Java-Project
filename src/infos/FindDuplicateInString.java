package infos;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateInString {

	public static void main(String[] args) {

		String str = "my name is is sumedh sumedh sumesh";

		String[] words = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		for (String word : words) {

			if (hm.containsKey(word)) {

				hm.put(word, hm.get(word) + 1);
				
			} else {

				hm.put(word, 1);
			}
		}

		Set<String> keys = hm.keySet();

		for (String key : keys) {

			if (hm.get(key) > 1) {

				System.out.println(key + " " + hm.get(key));
			}
		}

	}

}
