package repl_it;

import java.util.Scanner;

public class shoppinglist2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String item1,item2,item3,report;
		Double price1,price2,price3, totalprice;
		int count1,count2,count3;
		System.out.println("Enter Item1, count and its price:");
		item1=scan.nextLine();
		count1=scan.nextInt();
		price1=scan.nextDouble();
	
		
		System.out.println("Enter Item2, count and its price:");
		item2=scan.next();
		count2=scan.nextInt();
		price2=scan.nextDouble();
		
		
		System.out.println("Enter Item3, count and its price:");
		item3=scan.next();
		count3=scan.nextInt();
		price3=scan.nextDouble();
		
		if (count1==0 && count2 == 0 && count3 == 0) {
			
		
			
		}
		
		totalprice=(price1+price2+price3);
		
		report=(item1+price1)+(item2+price2)+(item3+price3);
		System.out.println(report);
		System.out.println("Total price: "+totalprice);
		
		
		
		
		 
	}

}
