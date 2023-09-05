package hello_world;

import java.util.Arrays;

public class substring {
public static void main(String[] args) {
	
	String s = "hello, my name is harsh";
	String[] sa = s.split("\\.");
	
	System.out.println(Arrays.toString(sa));
	
	

	
	System.out.println(s.substring(6));
	System.out.println(s.substring(0,6));
	
	
}
}
