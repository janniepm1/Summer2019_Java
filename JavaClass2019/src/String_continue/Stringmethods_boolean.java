package String_continue;

public class Stringmethods_boolean {
	public static void main(String[] args) {
		/*
		 * isEmpty:checks if the string is empty and it return boolean expressions
		 * empty==true,not,empty, !empty==false
		 */
		
		String str="Cybertek";
		boolean R1= str.isEmpty();
		System.out.println(R1);
		String str2="";
		if (!str2.isEmpty()){
			System.out.println("its empty string");
		}else {
			System.out.println("its not empty");
		}
		
		
		
		/*
		 * equals(str):checks if the two strings visible text are equal or not,
		 * then returns boolean expressions
		 * equal==true     !equal==false
		 * 
		 */
		String a1="Cybertek";
		String a2=new String("Cybertek");
		System.out.println(a1==a2);//false
		 
		boolean r2=a1.contentEquals(a2);
		System.out.println(r2);//true
		
		System.out.println("java".equals("Java"));//false because case sensitivity
	
	
		/*
		 * equalsIgnoreCase(str):cheks if the 2 strings visible texts
		 * are equal or not then returns boolean expressions 
		 * case sensitivity does not matter
		 */
		
		
		String s="Java";
		String s2=new String ("java");
		System.out.println(s==s2);//false located in different pools and case sentivity
		System.out.println(s.equals(s2));//false because case sensitivity
		System.out.println(s.equalsIgnoreCase(s2));//true because it only checks visible text
		
		
		
		/*
		 *contains(str): checks if the str is contained in the string or not  
		 * then returns a boolean expression 
		 * if its contained ==true
		 * !contained==false
		 */
	
		String name="Muhtar";
		boolean	result=	name.contains("good guy");//false
		System.out.println(result);
		
		String name2="MARUFJON";
		System.out.println(name2.contains("m"));//false case sensitivity
		
		
		/*
		 * startsWith("str"):checks if the string is started with the given str or not
		 * then returns boolean expressions 
		 * startedwith==true   !startedwith==false
		 */
				
			String todayclass="Java";	
			boolean result2=		todayclass.startsWith("J");
			System.out.println(result2);//true 
			
			String names="Cybertek School is a great place to learn Java";
			System.out.println(names.startsWith("Cybertek School"));//TRUE
	
	
			/* 
			 * endswith(str):checks if the string ended with the given str or not 
			 * then returns boolean expression
			 * endedwith==true     !endedwith==false
			 */
			
			String b1="Muhtar";
			System.out.println(b1.endsWith("R"));//FALSE CASE SENSITIVE
			System.out.println(b1.endsWith("r"));//true caase sensitive
			
	
	
	
	}

}
