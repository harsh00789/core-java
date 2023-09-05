package hello_world;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
public static void main(String[] args) {
	Set<String> sh1 = new HashSet<String>();
	
	sh1.add("harsh");
	sh1.add("rahul");
	sh1.add("kunal");
	sh1.add("ashok");
	
	System.out.println(sh1.contains("harsh"));
	sh1.remove("rahul");
	
	System.out.println(sh1);
	
	Iterator<String> i = sh1.iterator();
	
	while(i.hasNext()) {
		
		System.out.print(i.next()+" ");
		
	}
	
	
	
}
}
