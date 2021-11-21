package Day7;

import java.util.Scanner;

public class countDigitsUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

		System.out.println("Enter a Digits");
		 Scanner sc= new Scanner(System.in);
		    int num = sc.nextInt();   
	
	
	
		  int count=0;
		   while(num>0) {
			   num=num/10;
			   count++;
		   }
		   if(count==1) {
			   System.out.print("one Digit");
		   }else if(count==2) {
			   System.out.print("Two Digit");

		   }else if(count==3) {
			   System.out.print("Three Digit");

		   }else if(count==4) {
			   System.out.print("four Digit");
		   
		   }else if(count==5) {
			   System.out.print("five Digit");
		   }else {
				   System.out.print("more than five Digit");
		   }
	
	}

}
