package Day3;
import java.util.Scanner;
public class factUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a factorial of n");
		int n = sc.nextInt();
		sc.close();
		
		
		int i=1; int fact=1;
		 while(i<=n)
		 {
				fact=fact*i;
				i++;
		 
		 }
			System.out.println(fact);

}

}
