package hello_world;

import java.util.HashSet;
import java.util.Iterator;

public class hashset_ {

	public static void main(String[] args) {
		HashSet<String> h = new HashSet<>();
		
		h.add("one");
		h.add("two");
		h.add("three");
		h.add("four");
		h.add("five");
		
		Iterator<String> i = h.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
			
		}
		
		h.remove("four");
		System.out.println(h);
		
		
		
	}
	
}
