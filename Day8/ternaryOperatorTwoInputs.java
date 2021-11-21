package Day8;

import java.util.Scanner;

public class ternaryOperatorTwoInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		System.out.println("Enter a second number");
		int b = sc.nextInt();
		
		
		String result = (a>b) ?  "A is Greater":"B is Greater";
		System.out.println(result);
	
	
	}

}
