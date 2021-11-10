package Day2;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a number");
	int num = sc.nextInt();
	
	if (num%2==0) {
		System.out.println("Is not a prime  number");	
	}
	 else{
		System.out.println("Is a Prime number");

	}
	
	}

}
