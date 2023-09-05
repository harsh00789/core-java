package practicle;

import java.util.Scanner;

public class string_check_int {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		try {
			int s = Integer.parseInt(a);
			System.out.println("YES");
			
		}
		catch(NumberFormatException e) {
			
			System.out.println("NO");
			
		}
		
		
	}
	
}
