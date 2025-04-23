package codingtest;

public class Repeat {
	  public static void main(String[] args) {
		
		  int a = 9;
		  int b = 89;
		  
		  String r1 = String.valueOf(a) + String.valueOf(b);
		  String r2 = String.valueOf(b) + String.valueOf(a);
		  
		  int ir1 = Integer.valueOf(r1);
		  int ir2 = Integer.valueOf(r2);
		  
		  if(ir1 > ir2) {
			  answer = ir1;
		  }
		  else {
			  answer = ir2;
		  }
		  
		  System.out.println(ir1);
		  System.out.println(ir2);
		  
	  }
	        
	 
}
