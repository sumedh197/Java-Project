package jan;

public class FindDuplicateFromArray {

	public static void main(String[] args) {
		
		
		String arr[] = {"sumedh","polewar","nitesh","sumedh","polewar"};
		
		for(int i=0;i<=arr.length-1;i++) {
			
			
			for(int j=i+1;j<=arr.length-1;j++) {
				
				if(arr[i].equals(arr[j])) {
					
					System.out.println("Duplicate element is:: "+arr[i]);
					
					
					
				}
				
				
			}
			
			
			
		}
		

	}

}
