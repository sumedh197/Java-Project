package jan;

import java.util.ArrayList;

public class FindDuplicateFromArraylist {

	public static void main(String[] args) {

		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("sumedh");
		
		list1.add("nitesh");
		
		list1.add("rajesh");
		
		Object[] l = list1.toArray();
		
		ArrayList<String> list2 = new ArrayList<String>();
		
		list2.add("sumedh");
		
		list2.add("ashish");
		
		list2.add("nitesh");
		
		Object[] l1 = list2.toArray();
		

	list1.addAll(list2);
	
	for(int i=0;i<=l.length;i++) {
		
		for(int j=i+1;j<=l1.length-1;j++) {
			
			if(l.equals(l1)) {
				
				System.out.println(l);
			}
		}
		
	}
				}
			
		}
		
	


