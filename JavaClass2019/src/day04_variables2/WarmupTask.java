package day04_variables2;

public class WarmupTask {
	/* 
	 1. Cucumber     =>2.5$
	 2. Onion			=>1.5$
 	 3. Greenpepper	=>2$
	 4. Tomatoes	=>3$
	 5. Carrots 	=>4$
	 */
	public static void main(String[] args) {
		//Cucumber:
		// int Cucumber =2.5; we can only assIgn whole numbers to int, byte, short
		
		//float Cucumber =2.5;
		float Cucumber= 2.5f; // float cannot contain double
		double Cucumber2 = 2.5f; //double can contain float
		double Cucumber3 =2.5;
		
		
		//Onion: 1.5
		float Onion=1.5f ;
		double Onion2 =1.5;
		
		//Green pepper: 2$
		byte Greenpepper =2;
		short Greenpepper2= 2;
		int Greenpepper3 =2;
		long Greenpepper4= 2l;
		float Greenpepper5 =2f; //only time we add f or F when we are assigning decimals
		double Greenpepper6 =2;
		
		
		System.out.println(Greenpepper);
		System.out.println(Greenpepper2);
		System.out.println(Greenpepper3);
		System.out.println(Greenpepper4);
		System.out.println(Greenpepper5); //DOUBLE AND FLOAT CONVERT WHOLE NUMBER TO DECIMALS
		System.out.println(Greenpepper6);
		
		System.out.println(Cucumber);
		System.out.println(Cucumber2);
		System.out.println(Cucumber3);
		
		System.out.println(Onion);
		System.out.println(Onion2);
		
		double lenght= (3.5f);
		
	}

}
