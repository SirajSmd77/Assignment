package firstHand_oct_27;
import java.util.Scanner;
public class Fibonacci {

	 public static int fib(int N){
	        if (N <= 1) {
	            return N;
	        }
	        else{
	            return fib(N - 1) + fib(N - 2);
	                }
	              }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        System.out.println(fib(N));
	    }

	
	

}
