package Day5;
import java.util.Scanner;
public class multiplyThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
   System.out.println("Enter a first number");
      int a = sc.nextInt();
     System.out.println("Enter a second number");
     int b = sc.nextInt();
     System.out.println("Enter a third number");
     int c = sc.nextInt();   
    
     
     
     
     
     
     System.out.println("Enter int type three numbers multiplication value");
     System.out.println(multiply(a,b,c));
 	 multiply( a, b,c);  
     
 	 
 	 System.out.println("Enter a first number");
     Float x = sc.nextFloat();
     System.out.println("Enter a second number");
     Float y = sc.nextFloat();
     System.out.println("Enter a third number");
     Float z = sc.nextFloat();
    
 	 
     System.out.print("Enter float type three numbers multiplication value");
     System.out.print(multiply(x,y,z));
 	 multiply( x, y,z);
     
 	 
 	 
 	 
 	 
	
	
	}

  	static int multiply(int a , int b , int c) {
  		int res =a*b*c;
  		return res;
  	}
  	
  	
  	static float multiply(float a , float b , float c) {
  		float res =a*b*c;
  		return res;
  	}
  	
  	
  	static long multiply(long a , long b , long c) {
  		long res =a*b*c;
  		return res;
  	}
}
