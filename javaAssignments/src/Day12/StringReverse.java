package Day12;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="SIRAJ";  // madam

	      String reversedStr= reverse(str);
	   //    System.out.println(reverse(str));
	}
	 static String reverse(String str){  // "Geekster"
	      String res=" ";                 //   01234567

	      char[] arr=str.toCharArray();

	        for (int i=0;i<arr.length;i++){
	            res=arr[i]+res;  // res=e+tskeeG
	        }

	        System.out.println(res);

	        return res;
	    }
}
