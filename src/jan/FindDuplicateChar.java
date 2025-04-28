package jan;

import java.util.HashMap;
import java.util.Set;

public class FindDuplicateChar {

	public static void main(String[] args) {
		
String str = "sssshhhhsumedh";
		
		char[] words = str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<>();
		
		for(char word: words) {
			
			if(hm.containsKey(word)) {
				
				hm.put(word, hm.get(word)+1);
				
			}else {
				
				hm.put(word, 1);
			}
			
		}
		
		Set<Character> keys =hm.keySet();
		
		for(char key:keys) {
			
			if(hm.get(key)>1) {
				
				System.out.println(key + " " + hm.get(key));
				
				
			}
			
		}


	}

}
