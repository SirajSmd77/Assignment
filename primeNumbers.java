package firstHand_oct_27;

public class primeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int i;
		for(int num =1;num<=100;num++) {
		for(i=1;i<=num;i++) {
			if(num%i==0) 
			count+=1;
		}
		if(count==2) 
			System.out.print(" "+num);
			count =0;
 }	
        
	}

}
