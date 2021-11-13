package Day3;
import java.util.Scanner;
public class SumUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sum of N number");
		int num = sc.nextInt();
		sc.close();
		
		int sum=0, i=1;
		while(i<=num){
			sum=sum+i;
			i++;
		}
	
	    System.out.println(sum);
	}

}
