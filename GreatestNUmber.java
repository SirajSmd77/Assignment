package firstHand_oct_26;

import java.util.Scanner;

public class GreatestNUmber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
       	int a,b,c,greatest, temp;
	
	
		Scanner s = new Scanner(System.in);
		
		// from user input value a,b,c  
		System.out.println("Enter the First Number");
		a = s.nextInt();
		 
		System.out.println("Enter the Second Number");
        b = s.nextInt();
        
		System.out.println("Enter the third Number");
        c= s.nextInt();
        
        if (a>b) {
    		System.out.println("Greatest number is A ");

        } else if(b>c) {
    		System.out.println("Greatest number is B ");

        }else {
    		System.out.println("Greatest number is c ");

        }
        
        
		
		
		

	}

}
