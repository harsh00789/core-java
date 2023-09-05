package collection;

import java.util.Arrays;

public class string_array {
public static void main(String[] args) {
	
	String a[] = {"nilesh","harsh","abhay","vishal","dhvani","ami"};
	
	Arrays.sort(a);
	
	for(String k :a) {
		
		System.out.println(k);
		
	}
	
	int b[] = new int[a.length];
for(int i=0;i<a.length;i++) {
		
		b[i] = a[i].length();
		//System.out.println(b[i]);
		}
	
	
//	for(int i=0;i<a.length;i++) {
//	
//		for(int j=1;j<a.length-i;j++) {
//			
//			if(b[j-1]>b[j]) {
//				
//				int temp = b[j];
//				b[j] = b[j-1];
//				b[j-1] = temp;
//				
//			}
//		
//		}
//		//System.out.println(a[i].length());
//		 
//		
//	}
	System.out.println("******");
//	for(int i=0;i<a.length;i++) {
//		
//		//System.out.println(b[i]);
//		
//		for(int k=0;k<a.length;k++) {
//			
//			if(b[i]==a[k].length()) {
//				
//				
//				System.out.println(a[k]);
//				
//				
//			}
//			
//		}
		

		for(int h=1;h<a.length;h++) {
			String current = a[h];
			int j=h-1;
			while(j>=0 && a[j].length()>current.length()) {
				a[j+1] = a[j];
				
				j--;
			}
			a[j+1] = current;
			
		
		}
		
	
		for(int k=0;k<a.length;k++) {
			
			System.out.println(a[k]);
			
		}
		
	}
}

