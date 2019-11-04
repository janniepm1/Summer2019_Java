package Day14;

public class Ternary {
	public static void main(String[] args) {
		int num=0;
		if (true) 
			num=100;
	else 
			num=50;
		
		System.out.println(num);
		
		/*
		 * in ternary
		 *		 if (condition)	 ==>(condition)?
		 * 		else  		 	 ==>     :
		 * 		else if(condition) ==> 	  :	
		 */
		// ternary: in ternary body you can only give a single value
		//ternary must be initialized to a variable or printed pu . because it returns a value 
	
		// parenthesis is not required in ternary
		
		num= (true) ? 100 : 50 ;
	System.out.println(num);
		int y=(false) ? 100: 50;
		System.out.println(y);
		
		
		double InterestRate= 0;
		boolean GoodCredit= true;
		
		InterestRate=(GoodCredit== true) ? 0.5 : 0.9 ;
		System.out.println(InterestRate);
		
		
		
		byte grade=60;
		boolean Passed= grade >= 60 ? true : false;
				System.out.println(Passed);
		
				/*char FinalGrade='A';
				String Gotomarket="";
				if(FinalGrade=='A') {
					Group="Early Bird";
					} else if (FinalGrade=='B') {
						
					}else {
						
					}*/
				char FinalGrade='A';
				String Group="";
				
				Group=(FinalGrade == 'A') ? "Early bird":(FinalGrade =='B')? 
						"Group 1":"After Group 1";
				
				System.out.println(Group);	
				
				Group =(FinalGrade=='A')?"Early Bird"
						:(FinalGrade=='B')? "Group 1"
								:(FinalGrade=='C'? "Group2"
										:"After Group 2");
				System.out.println(Group);
				
				int Score =100;
				char Finals=' ';
				Finals =(Score>= 90 && Score<=100)? 'A'
						:(Score >=80 && Score <=89) ? 'B'
						:(Score>=70 && Score<=79)? 'C'
								:(Score >=60 && Score<=69) ? 'D'
								:(Score>=0 && Score<=59) ?'F'
										:' ';
				System.out.println(Finals);
				

								
				
		int a=10;
		int b=15;
		
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		 
		
		int n1=10000, n2=3000, n3=400;
		int max= (n1> n2 && n1>n3) ? n1
				:(n2> n1 && n2> n3) ? n2
				: n3;
		System.out.println(max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
