package Day4;

public class PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println("9:-Pyramid Pattern: ");
		    int i, j, n=5;
	        for (i=1;i<=n;i++){
	            for (j=(n-i);j>=1 ;j--){
	                System.out.print(" ");
	            }
	            for (int k=1;k<=i;k++){
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	}

}
