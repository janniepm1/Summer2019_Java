package Day_10IfStatement;

public class nested_if {
	/*
	 * nested if: \
	 * if (condition1){
	 * if (condition2){
	    //some code to run 
	 */
	
	
	/*60<=grade 70==D
	 * 70<GRADE <80==> C
	 * 80<=GRADE<90==>B
	 * 90<=GRADE<=100==>A
	 * 50<=grade<60==>f
	 * 40<=grade>50==>g
	 * 30<grade> 40==>h
	 * 20<=grade<30==>i
	 * 10<grade<=20==>j
	 * 0<grade<=10==>k
	 */
	
	public static void main(String[] args) {
		 int grade =40;
		 if (grade>=60 && grade <=100) {
			 System.out.println(" you Passed");
		 } else if (grade<60) {
				 System.out.println("You failed");
			 }
			 if (grade>=90&&grade<=100) {
				 System.out.println("\twith an A");
			 }
			 else if (grade >=80 && grade<90) {
				 System.out.println("\twith a B");
			 }
			 else if (grade>=70 && grade <80) {
				 System.out.println("\twith a C");
			 }
			 else if (grade>=60 && grade <70) {
					 System.out.println("\t wIth a grade of D");
				 }
			 else  if (grade>=50 && grade<60) {
				 System.out.println("\t with a grade of f");
			 }
			 else if (grade>=40 && grade <50) {
				 System.out.println("\t with a grade of G");
			 }
			 else if (grade>=30 && grade <40) {
				 System.out.println("\t with a grade og H");
			 }
			 else if (grade>=20 && grade <30) {
				 System.out.println("\t with a grade of I");
			 }
			 else if (grade >=10 && grade <20) {
				 System.out.println("\t with a grade of J");
			 }
			 else if (grade >=0 && grade <10) {
				 System.out.println("\t with a grade of k");
			 }
			 
		 
		 
			 else  //greater than 100
				 System.out.println("invalid score ,error 404");
			 
		 
		 
			 
		
		
	}
		
		
		
		
		
	}


