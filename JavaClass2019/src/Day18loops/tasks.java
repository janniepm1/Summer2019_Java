package Day18loops;

public class tasks {
	public static void main(String[] args) {
		//for (int a=1; a<=10 ;a+=2) {
			//System.out.println("Hello world");
			/* initialization: starting point int i=10....
			 * condition:created based on the initialization i>0
			 * iterator:co related to the condition needs to be capable to make the condition false
			 * if the condition is true, the loop will be executed 
			 * 
			 */
			
			
			//task2
			
			/* write a program that display each num even numbers 1-32
			 */
			
			for (int i=1; i<33; i++) {//even numbers
				
				if (i%2==0) {
				System.out.print(i+" ");	
			}}
			System.out.println();
		//task03;
for (int i=1; i<33; i++) {
				
				if (i%2 !=0) {//odd numbers
				System.out.print(i+" ");	
			}}
	//reverse a string
		String str="Cinthya";
		//			01234
		//reverse will be "avaJ"
		String rev=""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
		String rev2="";
		for(int i=str.length()-1;i>=0; i--) {
		rev2+=str.charAt(i);}
			
			System.out.println(rev2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
		}
	}



