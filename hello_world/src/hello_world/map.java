package hello_world;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class map {
public static void main(String[] args) {
	Map m = new HashMap();
	
	m.put("h", "2545");
	m.put("s","456");
	m.put("t", "789");
	m.put("u", "65554");
	
	//object is not consider as a entryset so we not used m.entryset here
//	for(Map.Entry h : m.entrySet()) {
//		
//		System.out.println(h.getKey()+" "+h.getValue());
//		
//	}
	
	
	Set s = m.entrySet();
	
	
Iterator i = s.iterator();
	
while(i.hasNext()) {
Map.Entry	ent = (Map.Entry)i.next();

System.out.println(ent.getKey()+" "+ent.getValue());

}




	//System.out.println(m);
	
}}
