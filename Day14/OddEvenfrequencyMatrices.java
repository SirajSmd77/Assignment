package Day14;
import java.util.Scanner;
public class OddEvenfrequencyMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[n][m];
		int count=0;
		int  s =0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j] = sc.nextInt();
				if(mat[i][j]%2==0) {
					count++;
				}
				else {
					s++;
				}
			}
		}
		System.out.println("No. of even numbers in the matrix is: "+count);
		System.out.println("No. of odd numbers in the matrix is: "+s);}

}

