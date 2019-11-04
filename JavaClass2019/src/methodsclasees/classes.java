package methodsclasees;

public class classes {
	public static void main(String[] args) {
		System.out.println("The square root of 16::"+Math.sqrt(16));
		System.out.println("4 to the power of 3000 is::"+ Math.pow(3,4));
	System.out.println(Math.max(100,50));
		
		//find the max number
	int num1=100;
	int num2=50;
	int num3=150;
	int max=Math.max(Math.max(num1, num2),num3);
	int min=Math.min(Math.min(num1, num2),num3);
	System.out.println(max);
	System.out.println(min);
	
	System.out.println((int)(Math.random()*150)+10);//159
	System.out.println((int)(Math.random()*151)+10);//160
	}

}
