package cap;

public class FactoriaNumber {

	public static void main(String[] args) {

		
		
		int num = 4; //4*3*2*1=24
		
		int fact = 1;
		
		for(int i=1;i<=num;i++) {
			
			fact = fact*i;
		}
		
		System.out.println(fact);

	}

}
