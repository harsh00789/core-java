package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import hello_world.iterator;

public class arraylist {
public static void main(String[] args) {
	student s1 = new student(1,"harsh","atmiya");
	student s2 = new student(2,"rahul","vvp");
	student s3 = new student(3,"harsh","marvadi");
	student s4 = new student(4,"akash","IIT");	
	student s5 = new student(5,"kunal","NIT");
	student s6 = new student(6
			,"dhairya","atmiya");
	
	
	ArrayList<student> as = new ArrayList<student>();
	
	as.add(s1);
	as.add(s2);
	as.add(s3);
	as.add(s4);
	as.add(s5);
	as.add(s6);
	
//	as.toString();

	
	Iterator i = as.iterator();
	
	while(i.hasNext()) {
		
		
		System.out.println(i.next());
		
	}
	
	//we are using set here so duplicate elements are already removed
	List l = new ArrayList<>(); 	
	l.add(s1.getCollage());
	l.add(s2.getCollage());
	l.add(s3.getCollage());
	l.add(s4.getCollage());
	l.add(s5.getCollage());
	l.add(s6.getCollage());
	
	
	Set s = new HashSet<>(); 	
	s.add(s1.getName());
	s.add(s2.getName());
	s.add(s3.getName());
	s.add(s4.getName());
	s.add(s5.getName());
	s.add(s6.getName());
	
	Iterator i2 = s.iterator();
	
	while(i2.hasNext()) {
		
		System.out.println(i2.next());
	}
	
	
	Map<String, String> x = new HashMap();
	//x.put("", null)
	
    Set y = x.entrySet();
    Iterator i3 = y.iterator();
    
    while(i3.hasNext()) {
    	
    //	x.put(l, y);
    	
    }
    
	//x.put(l, s);
	
	System.out.println(x.containsKey("atmiya"));

	for(Map.Entry m : x.entrySet()) {
		
		if(x.containsKey("atmiya")) {
			
			System.out.println(m.getValue());
			
		}
		
	}
	
	System.out.println(x);
	
	
	//x.put(s1.getCollage(),s.getClass() );
	
	

//System.out.println(x.containsValue(x.get(x)));	
	
	
	System.out.println(as.get(2));
	
	
	
//	student x = new student();
//	x.setId(0);
//	x.setName("harsh");
//	x.setCollage("vvp");
//System.out.println(x.getId());
	
	
	
	
}
}
