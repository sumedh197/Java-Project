package jan;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ReversePartialy {

	public static void main(String[] args) {

		
		String str = "sumedh123";
		
		String rev="";
		
		String first = str.substring(0,6);
		
		System.out.println(first);
		
		String last = str.substring(6,str.length());
		
		System.out.println(last);
		
		for(int i=last.length()-1;i>=0;i--) {
			
			rev = rev + last.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println(first+rev);
	}

}
