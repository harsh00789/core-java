package hello_world;

 class ab{
	private final String s;
	
	
	ab(final String s){
		this.s = s;
}
	
	public void setter(String sd) {
		// this.s = sd;
	}
	
	public String getstring() {
		return s;
}
	
	
}


public class immutable {
public static void main(String[] args) {
	
	ab x =new ab("harsh");
	System.out.println(x.getstring());
//	 x = new ab("xy");
//	 System.out.println(x.getstring());
	 
	
}
}
