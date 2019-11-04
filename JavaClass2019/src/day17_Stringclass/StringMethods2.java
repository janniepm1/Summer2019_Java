package day17_Stringclass;

public class StringMethods2 {
	public static void main(String[] args) {
		/*
		 * replace(old char, new char);
		 * replaces all the old char values with the given new char value 
		 * string and returns it as a new string value
		 */
		
	String str1="Java is fun Programing language";
			str1.replace('a','e');
			System.out.println(str1);//it will give me the same i have to change the variable
			//string is immutable 
			str1=str1.replace('a','1');
			System.out.println(str1);//NOW IT CHANGEs because you change its value
			
			/*
			 * replace (old str,new str)
			 * replace all the str values with the given new str values
			 */
	
	String str2="Today is gonna be a great day to learn java";
	str2=str2.replace("Today","Tomorrow");
	System.out.println(str2);
	
	/*
	 * replaceFirst(old str,new str);
	 * it replaces the first occured old str with the new str
	 * in the string and returns it as a new strign vlue
	 
	 */
	String s1="Java is fun, Java is good";
			s1=s1.replaceFirst("Java","Python");
			System.out.println(s1);
	s1=s1.replaceFirst("Java","Python");
	System.out.println(s1);
	
	s1=s1.replace('s', 'S');
	s1=s1.replace('g', 'G');
	System.out.println(s1);
	
	String s2="Java programming language, java is java";
	s2=s2.replaceFirst("Java is java","C# is java");
	System.out.println(s2);
	}
	

}
