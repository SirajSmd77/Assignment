package Day4;

public class ReversePyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		 System.out.println("10 :- Reverse Pyramid Pattern: ");
		    int i,j, n=5;
	        for (i=n;i>=1;i--){
	            for (j=i;j<=n;j++){
	                System.out.print(" ");
	            }
	            for (int k=1;k<=i;k++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	
	}

}
