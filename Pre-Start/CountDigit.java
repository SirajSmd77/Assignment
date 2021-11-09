package firstHand_oct_27;

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 9000000;
		int count = 0;
		while(num != 0) {
			num = num/10;
			count++;
		}
		System.out.println(count);

	}

}
