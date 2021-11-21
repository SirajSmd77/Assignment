package Day8;

import java.util.Scanner;

public class ternaryOperatorThreeInputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number");
		int a = sc.nextInt();
		System.out.println("Enter b second number");
		int b = sc.nextInt();
		System.out.println("Enter c third  number");
		int c = sc.nextInt(); 
		
        System.out.println("Greater number is : ");
		int result = (a>b)? (a>c)? a :b:(b>c)? b:c;
		System.out.println(result);}

}
