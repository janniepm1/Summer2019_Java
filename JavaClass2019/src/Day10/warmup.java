package Day10;

public class warmup {
	
	
	public static void main(String[] args) {
		
	//leap year because it can be divided by 4, 366 days in leap year
	int year=2000;
	boolean leapyear= year% 4==0;
	if (leapyear) {
		System.out.println("year"+year +"is a leapyear");
	}
	else {
		System.out.println("year"+year+"is not a leapyear");
	}


// grade calculator 
/* A=90-100
B=79-89
C=69-79
D=0-69
*/
   int grade=56;// if a condition can be evaluate in different scenarios
   boolean A=grade>= 90&& grade <=110;
   boolean B= grade >= 80 &&grade <=89;
   boolean C= grade>=70 && grade <=79;
   boolean D= grade >=60 && grade <=69;
   boolean validgrade= grade>=0 && grade <=100;
	if(validgrade) {	   
   if (A) {
	   System.out.println("You have A"); //100>=grade>=80
}
   else if (B) {//80> grade>=80
	   System.out.println("You have B");
   }
   else if (C) {//80>grade.=70
	   System.out.println("you have C");
    }
   else if (D) {// 70>grade>=60
	   System.out.println("you have D");
   }
   else {//0=<60
	   System.out.println("you have Failed with F");
   }
   
   }
	else {//grade<0|| grade>100
		System.out.println("Invalid Grade");
	}
			
	

/*decleare a variable called ager,, declare a boolean variable "goodperson' 
 * \age>=18=>cigar 
 * age>=21=> hookah
 * age>=25=>alcohol
 * age<18=> milk
 * else bad for your health
 */
int age=30;

 boolean GoodPerson= false;
 if (age>=18) {
	 if(GoodPerson) {
		 System.out.println("Alcohol is bad for your health");
	 }	else {// goodperson=false, &&age>=18
		 System.out.println("You can buy cigarrets"); 
		 	if(age>=21) {
		 		System.out.println("You can buy hookah");
		 	}
		  if (age>=25) {
		 		System.out.println("you can buy alcohol");
		 	}
	 }
 }
	 else { 
	 System.out.println("buy milk");
	 }
	

	
	

/*1. write a program that can find the number of days ina month 
 * (assume that feb has 28 days )
 * int month=0-12:
 * jan, feb, mar, apr, may, yun, jul, aug, sep, oct,nov, dic
 * 31	28		31		30	31	30		31	 30  31 30   31 
 * 		Must use nested if 
 * 28 days:2
 * 30 days :4,6,9,11
 * 31 days 1,3,5,7,8,10,12
 * even number thats has 30 days ; 4& 6
 * odd number give us 30 days :9 & 11 
 * even number that gives us 31 : 8,10,12
 * odd numbers that has 31 days : 1,3,5,7
 * 
 * */
    int month=12;

if (month >0 && month <13) {
	if(month< 8 && month>0 ) {
		if (month==1) {
			System.out.println("31");
		}
		else if (month==2)	{
			System.out.println("28");
		}
		else if (month==3) {
			System.out.println("31 days");
		}
		else if (month == 4) {
			System.out.println("30 days");
		}
		else if (month==5) {
			System.out.println("31 days");
		}
		else if (month==6) {
			System.out.println("30 days");
		}
		else if (month==7) {
			System.out.println("31 days ");
		}
		else if (month%2==0) {//month is greater than 7 ,if its even ==>31 days 
			System.out.println("31 days");
		}
		else {
			System.out.println("30 days ");
}
	}
}
else {//months greater than7, if its odd number ==>30 days 
	System.out.println("Invalid entry");
}

	




int months= 2;


if (months>0 && months <13) {
    if (months==1 || months==3 || months==5 || months==7
            || months==8|| months==10|| months==12) {
        System.out.println("31 days");}
    else if (months==4 || months==6|| months==9||
                months==11) {
            System.out.println("30 days");}
    
    else {System.out.println("28 days");}    
                           }
else {
    System.out.println("invalid month input");
}
}

}
 


















 

   
   
   
   
   
   
   

   

   
   
   
   
   
   