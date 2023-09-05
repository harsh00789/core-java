package hello_world;

public class loop_control {
public static void main(String[] args) {
	
	//simple for loop
	System.out.println("simple for loop");
	
	for(int i=0;i<=12;i++) {
		
		System.out.println(i);
	
		
		
	}
	
	//while loop
	System.out.println("while loop");
	int i =1;
	while(i<12) {
		System.out.println("while loop : "+i);
		i++;
	}
	
	// nested for loop
	System.out.println("nested for loop");
	
	for(int k=0;k<6;k++) {
		for(int j=0;j<=k;j++) {
			
			System.out.print("*");
			
		}
		System.out.println();
	}
	
	//for each loop
	System.out.println("foreach loop");
	
	int a[] = {5,6,87,54,23,6};
	
	for(int o:a) {
		
		System.out.print(o+" ");
	}
	
	//labeled for loop
	System.out.println();
	System.out.print("labeled for loop");
	
	aa:
		for(int l=1;l<5;l++) {
			
			bb:
				for(int h=1;h<5;h++) {
					if(l==2 && h==2) {
						break aa;
					}
					System.out.println();
					System.out.print(l+" "+h);
				}
			
		}
	
	
}
}
