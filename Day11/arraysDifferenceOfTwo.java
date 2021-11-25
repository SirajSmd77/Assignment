package Day11;
import java.util.Scanner;
public class arraysDifferenceOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scn = new Scanner(System.in);
	        int[] arr1 = new int[20];
	        int[] arr2 = new int[20];
	        int[] diff = new int[20];
	        System.out.println("Enter the size of array");
	        int n = scn.nextInt();
	        System.out.println("Enter the elements of arr1");
	        for(int i=0;i<n;i++){
	            arr1[i] = scn.nextInt();
	        }
	        System.out.println("Enter the elements of arr2");
	        for(int j=0;j<n;j++){
	            arr2[j] = scn.nextInt();
	        }
	        for(int k=0;k<n;k++){
	            diff[k] = arr1[k] - arr2[k];
	        }
	        System.out.println("difference ot two array is  ");
	        for(int i=0;i<n;i++){
	            System.out.print(diff[i]+"  ");
	        }
	     }
}
