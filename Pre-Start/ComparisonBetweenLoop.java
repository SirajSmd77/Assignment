package firstHand_oct_27;

public class ComparisonBetweenLoop {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int i=10;
		for(;i<=5;i+=1) {
			System.out.println(i);
		}
		while(i<10) {
			System.out.println(i);
			i+=1;
		}
		do {
			System.out.println(i);
			i+=1;
		}while(i<=10);
	}

}
