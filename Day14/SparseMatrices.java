package Day14;
import java.util.Scanner;
public class SparseMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[][] mat=new int[3][3];
		int n=mat.length;
		int m=mat[0].length;
		int count=0;
		System.out.println("enter elements");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		int size=n*m;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(mat[i][j]==0) {
					count++;
				}
			}
		}
		if(count>(size/2)) {
			System.out.println("matrix is sparse matrix");
		}
		else {
			System.out.println("matrix is not sparse matrix");
		}
	}

}
