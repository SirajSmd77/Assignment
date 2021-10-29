package firstHand_oct_27;
import java.util.Scanner;
public class Farenheit_To_Celsius_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int S, E, W, fh;
	            S=sc.nextInt();
	            E=sc.nextInt();
	            W=sc.nextInt();
	        while(S<=E){
	            fh=((5*(S-32))/9);
	            System.out.println(S+"\t"+fh);
	            S+=W;
	        }
	
	}

}
