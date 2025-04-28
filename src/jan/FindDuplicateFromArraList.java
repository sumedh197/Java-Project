package jan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FindDuplicateFromArraList {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<>();

		ar.add("sumedh");
		ar.add("Nitesh");
		ar.add("sumedh");
		ar.add("Nitesh");

		Set<String> set = new HashSet<>();

		for (String name : ar) {

			if (set.add(name) == false) {

				System.out.println(name);

			}

		}
	}

}
