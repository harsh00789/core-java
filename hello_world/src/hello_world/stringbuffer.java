package hello_world;

public class stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		//first one stringbuffer capacity is 16 bit
		System.out.println(sb.capacity());
		sb.append("hello");
		System.out.println(sb.capacity());
		sb.append(" ");
		sb.append("my name");
		System.out.println(sb.capacity());
		sb.append(" is harsh|");
		
		// Now (16*2)+2=34     i.e (oldcapacity*2)+2
		System.out.println(sb.capacity());
		sb.insert(1, "thaker");
		
		sb.replace(1, 7, "       ");
		
		sb.delete(1,8);
		
		// sb.reverse();
		
		
		System.out.println(sb);
		
		
		
		
	}
	
	
}
