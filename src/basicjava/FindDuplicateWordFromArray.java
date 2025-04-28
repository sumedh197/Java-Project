package basicjava;

import java.util.HashMap;

public class FindDuplicateWordFromArray {

	public static void main(String[] args) {
		
		
		String str = "my name is sumedh sumedh";
		
		String[] words = str.split(" ");
		
		HashMap<String,Integer> hm = new HashMap<>();
		
		for(String word:words) {
			
			if(hm.containsKey(word)) {
			
			hm.put(word, hm.get(word)+1);
				
		}else {
			
			hm.put(word, 1);
		}
	}
		System.out.println(hm);

}
}