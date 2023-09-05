package hello_world;

import java.util.Scanner;

public class array {

	array(){
		System.out.println("this is costructor");
		
	}
	
	public static void main(String[] args) {
		
		int a[] = new int[5];
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 6 numbers : ");
		for(int i=0;i<a.length;i++) {
			
			a[i] = sc.nextInt();
			
		}
		System.out.println("this you have entered : ");
		for(int j=0;j<a.length;j++) {
			
			System.out.println(a[j]);
		}
		
	}
	
}
