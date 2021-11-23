package Day10;
import java.util.Scanner;
public class arrayPositiveNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter an  Size of array");
	int size = sc.nextInt();
	int arr[] = new int[size];
	
	System.out.println("Enter a number of elements array");
    for(int i=0; i<size;i++) {
    	arr[i]=sc.nextInt();
    }
   for(int i=0;i<size;i++) {
	    if(arr[i]>0) {
	    	System.out.println( "Positive Numbers of an array is : " + "" +arr[i]);
		   
	   }
             
	   
   }
   
	
	
	
	}

}
