package repl_it;

import java.util.Scanner;

public class consolemenu {
	
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("---------------");
	    System.out.println("select an option:");
	    System.out.println("1) option 1");
	    System.out.println("2) option 2");
	    System.out.println("3) option 3");
	    System.out.println("---------------");
	    
	    int choice = s.nextInt();
	    
	  
	 //  switch (choice) {
	//   case 1:
		//  System.out.println("user selected 1");
		  // break;
	   //case 2:
		 // System.out.println("user selected 2");
		   //break;
	   //case 3:
		 // System.out.println("user selected 3");
		   //break;
		   //default:
			 // System.out.println("option unavailable");
			  // break;
	    if (choice==1) {
	    	System.out.println("User selected 1");
	   }else if (choice==2) {
		   System.out.println("User selected 2");
	   }else if (choice==3) {
		   System.out.println("User selected 3");
	   }
	    	
	    	
	    
	    
	    
	    
	    
	    

	    

}
}