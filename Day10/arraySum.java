package Day10;
import java.util.Scanner;
public class arraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an array");
	int size = sc.nextInt();
	int array[] = new int[size];
	int sum=0;
	System.out.println("Enter elements of array");

	
	for(int i=0; i<size;i++) {
		array[i]=sc.nextInt();
	
	}
	for(int i=0;i<array.length;i++) {
		sum = sum+array[i];
		
	}
	System.out.println("SUM of ARRAY is : " + sum);

	}

}
