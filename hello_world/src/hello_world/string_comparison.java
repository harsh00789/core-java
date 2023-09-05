package hello_world;

public class string_comparison {
public static void main(String[] args) {
	
	String s1="harsh";
	String s2="harsh";
	
	System.out.println(s1.equals(s2));
	
	String s3 = "HARSH";
	
	System.out.println(s1.equals(s3));
	System.out.println(s1.equalsIgnoreCase(s3));
	
	
	String s4 = new String("harsh");
	
	System.out.println(s1==s2);  //true (because both refer to same instance)
	System.out.println(s1==s4);  //false(because s3 refers to instance created in nonpool) 
	
	
}
}
