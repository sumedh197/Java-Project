package seleniumPract;

import java.util.HashMap;
import java.util.Set;

public class FindDupicareCharFromString {

	public static void main(String[] args) {
		
		String str = "sumedhhhhddkkk";
		
		char words[] = str.toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		
		for(char word:words) {
			
			if(hm.containsKey(word)) {
				
				hm.put(word, hm.get(word)+1);
			}
			else {
				
				hm.put(word, 1);
			}
		}
		System.out.println(hm);
		
		Set<Character> keys = hm.keySet();
		
		for(char key:keys) {
			
			if(hm.get(key)>1){
				
				System.out.print(key + "" + hm.get(key) + "");
			}
		}
				

	}

}
