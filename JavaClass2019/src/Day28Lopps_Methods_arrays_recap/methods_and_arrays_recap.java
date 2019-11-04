package Day28Lopps_Methods_arrays_recap;

public class methods_and_arrays_recap {
		
	
	/* write a method that accepts 3 parameters: 2 numbers and one operator
	 * 		if operator is not between[-,+,*,%] output should be invalid operator
	 * 			ex:calculate(10,2,"*")==20
	 * write a method that can calculate grade
	 * if score is 100-90==	A
	 * if the score is 89-80==B
	 * if the score is 79-70==C
	 * if the score is 69-60==D
	 * if score is0-59==f
	 * otherwise invalid score 
	 * write a method that can calculate how many years left till retirement
*/
	public static void main(String[] args) {
		calculate(10,2,"-");
		CalculateGrades(75);
	}
public static void CalculateGrades(int Score) {
	char Grade= (Score>=90 && Score<=100)?'A':(Score>=80 && Score<=89)?'B':
		(Score>=70 && Score<=79)?'C':(Score>=60 && Score<=69)?'D':(Score>=0 &&Score<=59)?
				'F':'I';
	if(Grade=='i') 
		System.out.println("Invalid Score");
		else {
			System.out.println(Grade);
		}

}
public static void  calculate(int a, int b, String ope) {
	String result="";
 if(ope.equals("-")) {
	 result+=(a-b);
 }else if(ope.equals("+")) {
	 result+=(a+b);
 }else if (ope.equals("*")) {
	 result+=(a*b);
 }else if(ope.equals("/")) {
	 result+=(a/b);
 }else if (ope.equals("%")) {
	 result+=(a%b);
 }else {
	 System.out.println("Invalid operator");
 }
 String result2="";
 result2+=(ope.equals("-"))?(a-b):(ope.equals("+"))?(a+b):(ope.equals("*"))?(a*b):
	 (ope.equals("/"))?(a/b):(ope.equals("%"))?(a%b):("Invalid operator");
 System.out.println(result2);
	
}
}