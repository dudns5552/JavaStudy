package codingtest;

import java.util.Scanner;

public class ToString2 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a + b;
        
        char[] chArr = c.toCharArray();
        for(int i = 0 ; i < chArr.length ; i++){
            if(Character.isWhitespace(chArr[i])) {
                for(int j = i ; j < chArr.length-1 ; j++)
            	chArr[i] = chArr[i+1];
            }
        }
        for(int i = 0 ; i < chArr.length ; i++){
            System.out.print(chArr[i]);
        }
        
    }
}
