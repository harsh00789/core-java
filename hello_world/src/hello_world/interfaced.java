package hello_world;

 interface printable{
	void print();	
}

  class a implements printable{
	 
	 public void print() {
      System.out.println("this method is from interface");		 
	 }
	 
 }
 
 
public class interfaced {

	
	public static void main(String[] args) {
		a o = new a();
		o.print();
		
		
	}
	
}
