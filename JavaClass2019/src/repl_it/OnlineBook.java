package repl_it;

import java.util.Scanner;

public class OnlineBook {
	public static void main(String[] args) {
		/*
		 *  Online Book Merchants offers premium customers 1 free book with every purchase of 
		 *  5 or more books and offers 2 free books with every purchase of 8 or more books.
		 *   It offers regular customers 1 free book with every purchase of 7 or more books, 
		 *   and offers 2 free books with every purchase of 12 or more books. 
     Write a program that assigns freeBooks the appropriate value based on the values of the 
     boolean variable isPremiumCustomer and the int variable nbooksPurchased. Print amount of freeBooks into the console. 

		 */
		
	    	
	    
	    int freeBooks = 0;
        Scanner scan = new Scanner(System.in);
        boolean isPremiumCustomer = scan.nextBoolean();
        int nbooksPurchased = scan.nextInt();
        if (isPremiumCustomer) {
            freeBooks =(nbooksPurchased>=8)? 2:
                        (nbooksPurchased>=5)? 1:0;
        }
        else {
            freeBooks =(nbooksPurchased>=12)? 2:
                (nbooksPurchased>=7)? 1:0;
        }
        System.out.println(freeBooks);
        
        
    }





	   
	    
	    
	}


