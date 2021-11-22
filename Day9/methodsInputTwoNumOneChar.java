package Day9;
import java.util.Scanner;
public class methodsInputTwoNumOneChar {

	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number : ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number : ");
	        int b = sc.nextInt();

	        System.out.print("Enter operator : ");
	        char ch = sc.next().charAt(0);

	        System.out.println(a + " " + ch + " " + b + " = " + TwoNumOneChar(a, b, ch));
	        return ;

	    }
		// TODO Auto-generated method stub

		static String TwoNumOneChar(int a, int b, char c) {
	        switch (c) {
	        case '+':
	            return Integer.toString(a + b);
	        case '-':
	            return Integer.toString(a - b);
	        case '*':
	            return Integer.toString(a * b);
	        case '/':
	            return Float.toString((float) a / b);
	        case '%':
	            return Float.toString((float) a % b);
	        default:
	            return " Invalid operator";
	        }
	    }

	 
	}
