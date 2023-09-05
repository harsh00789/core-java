package hello_world;

import java.util.Scanner;

public class exception_ {

	public static void main(String args[]) {

		
		  Scanner sc = new Scanner(System.in); String a = sc.nextLine();
		  
		  try {
		  
		  int b = Integer.parseInt(a);
		  
		  if (b % 2 == 0) {
		  
		  System.out.println("your number is even");
		  
		  } else { System.out.println("your number is odd"); }
		  
		  } catch (ArrayIndexOutOfBoundsException e) { System.out.println(e);
		  System.out.println("invalid");
		  
		  }
		 
		
//		String s ="hello";
//		System.out.println(s.substring(0,3));

	}
}
