package Day6;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		char ch;
		do {
		System.out.print("Enter a factorial of n");
		int n = sc.nextInt();
		
		
		int i=1; int fact=1;
		 while(i<=n)
		 {
				fact=fact*i;
				i++;
		 
		 }
			System.out.println(fact);
		
           System.out.println("do u wnt to continue ? Yes or No");
		
          ch = sc.next().charAt(0);
		
		}
          while(ch==('Y'));
	
		
	
	}

}
