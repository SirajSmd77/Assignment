package Day3;
import java.util.Scanner;

public class TableUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  
		
		int num,product;
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter a n Table");
     num = sc.nextInt();
       sc.close();
       
	int i=1;
    while(i<=10) {
        product=num*i;
        System.out.println(num +"*"+i+"=" +product);
             i++;
         
      }
    	
	}
}
