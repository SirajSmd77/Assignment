package firstHand_oct_26;

public class conditionStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 150;
		int num2 = 100;

		// print the greater number	
		if (num1 > num2) {
			System.out.println(num1);
		}else {
			System.out.println(num2);
		}


		System.out.println(100 > 10); //true
		System.out.println(10 > 50); //false
		System.out.println(10 < 50); //true
		System.out.println(100 < 50); //false
		System.out.println(10 == 50); // false
		System.out.println(10 == 10); //true

		System.out.println(10 != 50); // true
		System.out.println(50 != 50); //false


		System.out.println(10 >= 50); // false
		System.out.println(50 >= 50); //true
		System.out.println(100 >= 50); //true


		System.out.println(10 <= 50); // true
		System.out.println(50 <= 50); //true
		System.out.println(100 <= 50); //false
	}

}
