package hello_world;

import java.util.*;

public class list {
public static void main(String[] args) {
	List<String> l1 = new ArrayList<>();
	l1.add("apple");
	l1.add("mango");
	l1.add("banana");
	
	// for sorting a list
	Collections.sort(l1);
	
	for(String s1 : l1) {
		
		System.out.println(s1);
	}
	
	
	List<Integer> l2 = new ArrayList<>();
	l2.add(12);
	l2.add(11);
	l2.add(10);
	l2.add(22);
	l2.add(1);
	
	Collections.sort(l2);
	
	for(int s2 : l2) {
		
		System.out.println(s2);
		
	}
	
	
	
}
}
