package hello_world;

public class decison_making {
public static void main(String[] args) {
	
	int c = 10+12;
	
	System.out.println("simple if else....");
	if(c<10) {
		System.out.println("c is less than 10");
	}
	else {
		
		System.out.println("c is greater than 10");
	}
	
	System.out.println("if-else ladder....");
	
	String s = "harsh";
	
	if(s=="kunal") {
		
		System.out.println("hello kunal");
	}
	else if(s=="abhishek") {
		System.out.println("hello abhishek");
	}
	else {
		System.out.println("hello harsh");
	}
	
	
	if(c>10) {
		
		if(s=="harsh") {
			
			System.out.println("this is nested condition");
			
		}else {
			
			System.out.println("out");
			
		}
		
	}
	
	
	
	
}
}
