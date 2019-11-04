package Day_10IfStatement;

public class if_else_statement {
	//if & else
	/* if condition==a executed
	 * else fail 
	 * if condition its true then a/ if . if condition is false will be else
	 * else only gets executed if the condition is false
	 */
	public static void main(String[] args) {
		
		if (false ==!false) {
			System.out.println("if block");
		}
		else {
			System.out.println("else block");
		}
/* task01 if score <60==> failed
 * if score >=60 but score <90==>pass
 * if score >=90==>passed with distinction
 */
float score=59;
	if (score>=60) {
		System.out.println("passed");
	}
	else {
		System.out.println("failed");
	}
	/*
	 * 1.triangle: has 3 angles and sum of 3 angles must be =180
	 * 2.decleare 3 variables angle 1 anlge2, angle3.
	 * 3. write a program to check if the triangle is valid or not 
	 * 
	 */
	int angle1=2, angle2=50, angle3=75;
	boolean valid= (angle1+angle2+angle3)==180;
	
	if (valid) {
		System.out.println("Its a valid triangle ");
	}
	else { 
		System.out.println("Invalid triangle do some math");
	}
	
	}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	