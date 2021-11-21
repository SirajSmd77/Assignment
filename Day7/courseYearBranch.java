
package Day7;
import java.util.Scanner;

public class courseYearBranch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String Branch;
       int Year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year  :");
		  Year=sc.nextInt();
		
	     
		 System.out.println("Enter the Branch");
	      Branch=sc.nextLine(); 
		
		 
		System.out.println(" SUBJECT :");
	
	
    
    if(Year==1)  {
    	System.out.println(" Common subjects for all branches : English, Maths, Science");
    }
    
     else if (Year==2)
    	{
    	 switch (Branch)
    	 {
    	 case "CSE" : 
    	     	 System.out.println("Operating System,\n Java,\n Data Structure ");
    	          break;
    	 
    	 case "ECE" :
        	 System.out.println("Micro Processsor, logic Switching Theory ");
        	 
    	       break;
         
    	 case "MECH" :
        	 System.out.println("Drawing, Java, Manufacturing Machines ");
        	  break;
    	  default :
    		  System.out.println("Invalid data");
    	 }
    	}
    	 
    
    else if(Year==3)  {
    	switch(Branch) {
    	case "CSE" :
   	 System.out.println("Computer Organisation, Java, MultiMedia ");
   	 break;
    
    	case "ECE":
       	 System.out.println("Fundamental of Logic Design, Microelectronics ");
       	 break;
   	 
        
    	case "MECH":
       	 System.out.println("Internal Combustion Engine, Mechanical Vibration ");
       	 break;
    	 default :
    	    	System.out.println("not valid");
 
    	}
    }
    
    else if(Year==4) {
    		switch(Branch) {
    		
    		case"CSE" :
    		 System.out.println("Data Communication and Network, Java, MultiMedia ");
   	           break;
   	
    		case "ECE":
       	 System.out.println("Embedded System, Image Processing ");
       	 break;
        
    		case"MECH":
       	 System.out.println("Production Technology, Thermal Engineering ");
       	  	 break;
  
    default :
    	System.out.println("not valid");
    }
    }
    else {
    	System.out.println("Data Enter is Invalid ");
    }
	}

}
