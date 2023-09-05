package hello_world;




class student{
	int id;
	String name;
	static String collage = "IIT";
	
	
	student(int i , String n){
		id = i;
		name = n;
}
	
public void display() {
	System.out.println(id+" "+name+" "+collage);
}
	
}

public class static_keyword {
	
		static void fruit() {
			
			System.out.println("this is an apple");
		}
	

	
	
	public static void main(String[] args) {
		
		student s1 = new student(1,"harsh");
		s1.display();
		
		student s2 = new student(2,"rahul");
		s2.display();
		
		fruit();
		
	}

}
