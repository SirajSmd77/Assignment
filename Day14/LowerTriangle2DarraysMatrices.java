package Day14;
import java.util.Scanner;
public class LowerTriangle2DarraysMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		int[][] mat=new int[3][3];
		int n=mat.length;
		int m=mat[0].length;
		System.out.println("enter element");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				mat[i][j]=sc.nextInt();
			}
		}
		if(n!=m) {
			System.out.println("matrix should be square");
		}
		else {
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					System.out.println(mat[i][j]);
				}
				System.out.println();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(j>i) {
					System.out.print("0 ");
				}
				else {
					System.out.print(mat[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
