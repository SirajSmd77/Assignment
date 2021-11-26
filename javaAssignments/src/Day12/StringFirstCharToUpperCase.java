package Day12;

public class StringFirstCharToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str="Shaik Mohammed Siraj";
     convertFirstUpper(str);
 
}

	 static void convertFirstUpper(String str){
	      char[] arr=str.toCharArray();

	      for(int i=0;i<arr.length;i++){

	          if(i==0){
	              System.out.println(arr[i]);
	          }
	          if(arr[i]==' '){
	              System.out.println(arr[i+1]);
	          }

	      }

	 }
}
