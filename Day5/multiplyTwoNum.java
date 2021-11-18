package Day5;
import java.util.Scanner;


public class multiplyTwoNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter First number");
		 int a = sc.nextInt();
			
		 System.out.println("enter Second number");
		 int b = sc.nextInt();
		 
		 
			System.out.println(multiply(a,b));

			multiply(a,b);
			  
		}

		 static int multiply(int a , int b) {
			  int res = a*b;
			  return res;
			
		 }
	
	
	
	}


