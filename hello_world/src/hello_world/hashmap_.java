package hello_world;

import java.util.HashMap;
import java.util.Map;

public class hashmap_ {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "banana");
		hm.put(2, "apple");
		hm.put(3,"mango");
		hm.put(4, "orange");
		
		System.out.println("first hashmap ");
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());	
		}
		
		hm.putIfAbsent(5,"papaya");
		
		System.out.println("first hashmap after adding one element");
		
		for(Map.Entry m : hm.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		
		
		HashMap<Integer, String> h = new HashMap<Integer,String>();
		
		h.put(6, "ananas");
		h.put(7, "guava");
		h.put(8, "coconut");
		
		h.putAll(hm);
		
		System.out.println("adding first hashmap into second hashmap");
		
		for(Map.Entry m : h.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		
		
		
		
	}
	
}
