package Day_10IfStatement;


public class Multi_branch_Statement {

	//task1
	/*90=<grade<90==>A
	 * 80=<GRADE<80==>B
	 * 70<=GRADE<70==>C
	 * 60<=GRADE<70==>D
	 * ELSE==>F
	 */
public static void main(String[] args) {
	

	
int grade= 85;
if(grade>=90) {
	System.out.println("You have made A");

}
else if (grade>80 && grade>70){
	System.out.println("You made a B");
}
else if (grade>=70) {
	System.out.println("You made a C, Thats ok");
	
}
else if (grade>=60) {
	System.out.println("You made a D");
}
else {
	System.out.println("you made F Study more");
}

//task2
/* write a prpgram that:
 * 1.0-12==>Good morning
 * 2.12-15==>Good afternoon
 * 3. 15-23==> Good night
 */
int hour=2;

if (hour>=0 && hour <=12) {
	System.out.println("Good Morning !!");
}
else if (hour >12 && hour <=15) {
	System.out.println("Good Afternoon");
}
else if (hour>15 && hour <=23) {
	System.out.println("Good Night");
}
else {
	System.out.println("Noon");
}

/* task
 * int num1,num2,num3 find the bigger num

 */
int num1=200, num2=300, num3=50;
if (num1>=num2 && num1> num3) {
	System.out.println(num1+"is the bigger number");
}
else if(num3> num1 && num2 >num3) {
	System.out.println(num2+"is the bigger number ");
	
}
else if (num3>num2 && num3>num1) {
	System.out.println(num3+ "is bigger number");
	
}
else if (num3==num2&&num3>num1) {
	System.out.println(num3 +"and "+num2+"are the bigger number");
}
else if (num3==num1&&num3 >num2) {
	System.out.println(num3+ "and"+num1+"are the bigger number");
}
else if (num2==num1 && num2> num3) {
	System.out.println(num2+"and" +num1+"are the bigger number");
}
else {
	System.out.println("all of the are equal ");
	 System.out.println("all of them are equal");
 }

	

	
	
	
	
	
	
	
}
}




