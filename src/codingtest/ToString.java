package codingtest;

import java.util.Scanner;

public class ToString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String a = sc.next();
	        char[] chArr = a.toCharArray();
	        
	        for(int i = 0 ; i < chArr.length ; i++){
	        	if(Character.isUpperCase(chArr[i])){
	        		chArr[i] = Character.toLowerCase(chArr[i]);
	        	}
	        	else if(Character.isLowerCase(chArr[i])){
	                chArr[i] = Character.toUpperCase(chArr[i]);
	            }
	        }
	        for(int i = 0 ; i < chArr.length ; i++) {
	        System.out.print(chArr[i]);    
	        }
	        
	    }
	}
