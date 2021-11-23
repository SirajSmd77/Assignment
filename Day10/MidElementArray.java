package Day10;
import java.util.Scanner;
public class MidElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an  size of array");
	int n = sc.nextInt();
   int []array  = new int[n];
	System.out.println("Enter an  number of elements of an array");
  
	for(int i=0; i<n;i++) {
	  array[i]=sc.nextInt();	
	}
	
	
	
	System.out.println("middle Element of an array is : ");
	int h = n/2;
	
	
	System.out.println(h);

	}
	


}
