package Day4;

public class RightPascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("5:-Right Pascal's Triangle: ");
		 int i,j,n=5;
	        for(i=1;i<=n;i++) {
	            for (j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	
	}

}