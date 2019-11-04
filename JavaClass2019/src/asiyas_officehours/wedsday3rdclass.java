package asiyas_officehours;

public class wedsday3rdclass {

	public static void main(String[] args) {
		//calling a method==void method
		hi();
		//call method
		sum(100,345 );
		//datatypes: primitives and non primitives
		String word="Java";
		
		
							//calling length method of string
		System.out.println(word.length());	
		//2nd way of calling length()
		int wordoflenght=word.length();
		System.out.println(wordoflenght);
		
		
		
		//isempty() 1rst way
		System.out.println(word.isEmpty());
		//2nd way
		boolean checkEmpty=word.isEmpty();
				System.out.println(checkEmpty);
		
		
	//charAt() method
				System.out.println(word.charAt(0));//j
				char firstchar=word.charAt(0);
				char ch='j';
	}
		
				//method types: void and return
				//method void : 
				public static void hi() {
					
				System.out.println("hi,how are you");
				System.out.println(12345);
				System.out.println(false);
				
		
				}
				//Sum of two numbers method ==provide 2 numbers, plus them and get result
										//i should provide 2 nums
				//void method only execute the body
				
				public static void sum(int num1,int num2) {
					System.out.println("Your first number is "+num1);
					System.out.println("Your second number is "+num2);
					System.out.println("result will be "+(num1 +num2));
				}
				
				
				
				
				
				
				
				
				}

