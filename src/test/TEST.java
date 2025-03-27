package test;

public class TEST {

	public static void main(String[] args) {
		
		String p = "level";
		int i = 0;
		int max = p.length() -1;
		boolean tf = p.codePointAt(i) == p.codePointAt(max);
		
		System.out.printf("%s %s %b",p.codePointAt(i), p.codePointAt(max), tf);
	}
}
