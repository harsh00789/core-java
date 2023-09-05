package hello_world;

public class wrapper_class {
public static void main(String[] args) {
	
	int i = 20;
	Integer a = Integer.valueOf(i);
	
	
	System.out.println("boxing");
	System.out.println(a);
	
	int h=a;
	
	System.out.println("auto unboxing");
	System.out.println(h);
	
}
}
