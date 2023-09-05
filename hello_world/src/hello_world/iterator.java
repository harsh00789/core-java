package hello_world;

import java.util.*;

public class iterator {
public static void main(String[] args) {
	List<String> h = new ArrayList<>();
	h.add("harsh");
	h.add("rahul");
	h.add("kunal");
	
	Iterator<String> i = h.iterator();
	
	while(i.hasNext()) {
		
		System.out.println(i.next());
	}
	
	
	System.out.println(h);
}
}
