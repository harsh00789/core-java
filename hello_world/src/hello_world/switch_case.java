package hello_world;

import java.util.Scanner;

public class switch_case {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter number 1 : ");
	int a = sc.nextInt();
	System.out.println("enter number 2 : ");
	int b = sc.nextInt();
	
	System.out.println("enter operation from +,-,*,/");
	String x = sc.next();
	
	switch(x) {
	
	case "+":
		System.out.println(a+b);
		break;
	case "-":
		System.out.println(a-b);
		break;	
	case "*":
		System.out.println(a*b);
		break;	
	case "/":
		System.out.println(a/b);
		break;
	
	
	}   
	
}
}
