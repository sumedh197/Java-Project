package jan;

import java.util.HashMap;
import java.util.Set;

public class FindDuplivate {

	public static void main(String[] args) {

		String str = "my name is sumedh is sumedh";

		String[] words = str.split(" ");

		HashMap<String, Integer> hm = new HashMap<>();

		for (String word : words) {

			if (hm.containsKey(word)) {

				hm.put(word, hm.get(word) + 1);

			} else {

				hm.put(word, 1);

			}

		}

		System.out.println(hm);

		Set<String> keys = hm.keySet();

		for (String key : keys) {

			if (hm.get(key) > 1) {

				System.out.println(key + "  " + hm.get(key));

			}
		}

	}

}
