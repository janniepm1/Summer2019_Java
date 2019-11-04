package vacation;

import java.util.Scanner;


public class budget {
	public static void main(String[] args) {
		
	
 Scanner input= new Scanner(System.in) ;
	

	
		System.out.println("input your budget :");
		
		int budget=input.nextInt();
		
	
		if (budget>=5000 && budget<10000)
		{
			System.out.println("is a cheap vacation");
			System.out.println("choose a. Florida or b. West Virginia");
			String state =input.next();
			switch (state) {
			case "a":
				System.out.println("you choose FL");
				break;
			case "b":
				System.out.println("you choose WV");
				break;
				default:
					System.out.println("invalid entry");
					break;
			}
				
		}else if (budget >=10000 && budget<15000) {
			System.out.println("is an average vacation");
			System.out.println("choose 1.Canada pr 2.Mexico");
			int state=input.nextInt();
			switch (state) {
			case 1:
				System.out.println("you choose Canada");
				break;
			case 2: 
				System.out.println("You choose Mexico");
				break;
				default:
				System.out.println("Invalid entry");
				break;
			}
			
		}else if (budget >=15000 && budget<20000) {
			System.out.println("is an expensive vacation");
			System.out.println("choose a. Japan or b. England. ");
			char state=input.next().charAt(0);
			switch (state) {
			case 'a':
				System.out.println("you choose Japan");
			break;
			case 'b':
				System.out.println("you choose England");
			break;	
			}
		}else {
			System.out.println("not enough money for vacation");
		
		}
		
 
		
	 
		
	
		
	}	
		
		
	}		
		
		
		
	
		
	
		
	
	
	 
		
		
		
		
		
		
		
	
	


