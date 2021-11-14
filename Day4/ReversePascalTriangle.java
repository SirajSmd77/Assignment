package Day4;

public class ReversePascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		System.out.println("6:-Inverse Pascals Right Triangle: ");
		int i, j , n=5;
		for(i=n-1;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
		}

}
