package Day3;
import java.util.Scanner;
public class SwapInputUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a first number before swapping");
	int num1 = sc.nextInt();
	
	System.out.print("Enter a Second number before swapping");
	int num2 = sc.nextInt();
	
	
	int temp = num1;
	    num1 = num2;
	    num2=temp;
	    
	    
	System.out.println("After Swaping first Number is : " +num1);	
	System.out.println("After Swaping Second Number is : " +num2);	

	
	}

}
