package Day4;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("11 :- Diamond Pattern: ");
		    int i=1 , j, n=5;
	        for (i=1;i<=n;i++){
	            for (j=(n-i);j>=1 ;j--){
	                System.out.print(" ");
	            }
	            for (int k=1;k<=i;k++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	
	
	        for (i=n-1;i>=1;i--){
	            for (j=i+1;j<=n;j++){
	                System.out.print(" ");
	            }
	            for (int k=1;k<=i;k++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	
	}

}
