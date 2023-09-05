package hello_world;


class test{
	int id;
	String name;
	float fee;
	
	test(int id,String name,float fee){
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	public void display() {
		
		System.out.println(id+" "+name+" "+fee);
		
		
	}
}

public class this_keyword {
	
	
public static void main(String[] args) {
	
	
	test t1 = new test(1,"harsh",8500);
	test t2 = new test(2,"rudra",10545);
	t1.display();
	t2.display();

}
}
