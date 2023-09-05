package hello_world;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylist {
public static void main(String[] args) {
	ArrayList<Integer> a = new ArrayList<>();
	
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	
//	for(int j : a) {
//		
//		System.out.println(j);
//	}
	
	Iterator i = a.iterator();
	
	while(i.hasNext()) {
		
		System.out.println(i.next());
		
	}
	
	System.out.println(a.get(2));
	
	a.set(1, 123);
	
	System.out.println("after set the value");
	for(int h : a) {
		System.out.println(h);
	}
	
	
	
	
}
}
