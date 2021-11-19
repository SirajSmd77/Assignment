package Day6;
import java.util.Scanner;
public class oddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	
	   System.out.println("Enter a number");
       int num = sc.nextInt();
		
	
		
		
	
		  oddEven(num);
		
		
	}
	 
       static void oddEven(int a){
    	  
       
    	   if(a%2==0){
    		   System.out.println("number is even");
    	   }
    	   else{
    		   
    		   System.out.println("number is odd");

    	   }   	   
       }
}
