package Day11;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class BinaryToDecimal {


		
		  public static void main(String[] args) throws Exception {
			// TODO Auto-generated method stub
			  
			  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			  System.out.println("Enter only Binary number");
			  int no = Integer.parseInt(reader.readLine(), 2);
			  System.out.println(no);
	}

}
