package Day5;

import java.util.Scanner;

public class maxThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
	     System.out.println("Enter a first number");
	     int a = sc.nextInt();
	     System.out.println("Enter a second number");
	     int b = sc.nextInt();
	     System.out.println("Enter a third number");
	     int c = sc.nextInt();
	    
	 
       maxNum(a,b,c);

	
	}

	
     static void maxNum(int a, int b, int c)	{
	  
	  if(a>b) {
		  System.out.println("A is max of three number");
		  
	  }else if(b>c) {
		  System.out.println("B is max of three number");

		  
	  }else {
		  System.out.println("C is max of three number");

	  }
	  
	  
	  
	  
  }
  
  
	
}
