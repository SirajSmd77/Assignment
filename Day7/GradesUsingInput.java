package Day7;

import java.util.Scanner;

public class GradesUsingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 System.out.println("Enter Marks");
			
		    
		    Scanner sc= new Scanner(System.in);
		    int marks = sc.nextInt();
			
			if(marks <50) {
			    System.out.println("Fail");

			}else if(marks>=50 && marks<=59) {
			    System.out.println("D Grade");
			    
			    		
			}else if(marks>=60 && marks<=69) {
			    System.out.println("C Grade");

			}else if (marks>=70 && marks<=79){
			    System.out.println("B Grade");

			}else if(marks>=80 && marks<=89) {
			    System.out.println("A Grade");

			}else if(marks>=90 && marks<=100) {
			    System.out.println("A++ Grade");

			}
			else {
				System.out.println("invalid");
			}
			
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
