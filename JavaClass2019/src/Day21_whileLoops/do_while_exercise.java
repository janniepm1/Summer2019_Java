package Day21_whileLoops;

public class do_while_exercise {
	public static void main(String[] args) {
		
		;// not printing because while only executes true condition
			//only prints true statements
			/*
			 * do-while;
			 * do{
			 * 		Statements ;
			 * }		while(condition);
			 * compiler executes the do block first and then checks the condition, 
			 * if the condition is true keeps executing  otherwise exits the loop
			 * --do whiles loops body gets executed at least once
			 * regardless of conditions
			 * --while loops never gets executed if the condition is false
			 * --do while gets executes one time if the condition is false
			 * --do while loop
			 */
			boolean a=false;
			while(a) {
				System.out.println("Hello");
		}
			do {
				System.out.println("Hello");
			}while(a);
			
			
			int x=1;
			do {
				if(x%2==0) {
					System.out.print(x+" ");
				}x++;
				
			}while(x<=100);
			 System.out.println();
			do {
				System.out.println("Hello World");
				break;
				//after break you cannot add any more statements 
				
			}while(true);
			}
	

}
