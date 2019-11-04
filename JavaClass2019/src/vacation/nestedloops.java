package vacation;

import java.text.NumberFormat;

public class nestedloops {
	public static void main(String[] args) {
		NumberFormat currency=NumberFormat.getCurrencyInstance();
		NumberFormat percent=NumberFormat.getPercentInstance();
		percent.getMinimumFractionDigits();
		
		int MontlyInvestment=100;
		System.out.println("Montly Investment: "+currency.format(MontlyInvestment)+"\n");
		
		//create the header row and add it to the table
		String table="";
		String headerRow="year     ";
		for(double rate=5.0; rate<7; rate++) {
			headerRow+=percent.format(rate/100)+"   ";
		}
		//loops through the years
		for (int year=1; year<7; year++) {
			//add year through the start of the row
			String row=year+"   ";
			
		//loop through each rate 
		for(double rate=5.0; rate<7.0; rate+=.5) {
			int months=year*12;
			double monthlyInterestrate=rate/12/100;
			
			//calculate the future value
			double futurevalue=0.0;
			for(int i=1; i<=months; i++) {
				futurevalue=(futurevalue+monthlyInterestrate)*(1+monthlyInterestrate);
				
			}
			//add the calculation to the row
			row+=currency.format(futurevalue)+"     "  ;
		}
		//add the row to the taable
		table+=row+"\n";
		
		
	}
		System.out.println(table);

	}
}
