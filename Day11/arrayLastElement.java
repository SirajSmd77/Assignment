package Day11;
import java.util.Scanner;
public class arrayLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scn = new Scanner(System.in);
	        int[] array = new int[10];
	        System.out.println("Enter the size of array : ");
	        int n = scn.nextInt();
	        for(int i=0;i<n;i++){
	            array[i] = scn.nextInt();
	        }
	        System.out.println("your array is ");
	        for(int i=0;i<n;i++){
	            System.out.print(array[i]+" ");
	        }
	        System.out.println();
	        System.out.println("enter the value to find in the given array");
	        int num = scn.nextInt();
	        int count=0;
	        int flag=0;
	        for(int i=0;i<n;i++){
	            if(num==array[i]){
	                flag = i;
	                count=1;
	                continue;
	            }
	        }
	        if(count==0){
	            System.out.println(num+" is not present in your array ");
	        }
	        else{
	            System.out.println(num+" is present at index "+flag);
	        }
		
		}

}
