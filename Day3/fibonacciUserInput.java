package Day3;
import java.util.Scanner;
public class fibonacciUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int first=0  , second=1 , next ,i, num;
	System.out.println("Enter the number of term");
	
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();
	sc.close();
	
	
	
	for( i=0;i<num;i++) {
			if(i<=1){
			next=i;
		}
           
      else {
    	  next=first+second;
    	  first=second;
    	  second=next;
      }
			System.out.println("" +next);

  }
	
		
	}

}
