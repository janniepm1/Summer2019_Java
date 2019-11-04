package Day18loops;

public class forLoop {
public static void main(String[] args) {
	/*
	 * loop:used for repeating action if condition its true it continuosly executes 
	 * for(initialization;condition;iterator){
	 * 		statements that you want  to repeat
	 * initialization is based on the condition
	 * when the condition is false then it ill stops
	 * used for repeating action, repeat steps multiple times
	 * for loop you have initialization;condition;iterator{
	 * repeating statements} statements within loops body is repeated until the condition becomes false
	 * initialization: how many times you want to execute the loop
	 * 				ex:int 1=0;    starting point
	 * condition:condition is created based on the initialization
	 * 				ex:i<10
	 * iterator:co related to the condition, runs long enough and either increases or eventuallu
	 * condition becomes false
	 * 			ex;  i++,++i
	 * if the condition is flase loop wil not execute
	 * iterator is not mandatory but necessary
	 */
	
		//for (int i=10;i>0; i--) {//it will go from 10-1 in int you have to put the number of repeated times executes
		
			/*
			 * task01:
			 */
 
		for (int a=1; a<=10;a++) {
			System.out.println("The square of "+a+" is: "+(a*a) );
		}
	
}
}
