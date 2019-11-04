package Day27_customMethods;
public class MethodPracticeduplicatestr {
	/* wr
	 * write a method that can remove duplicates from the string and prints the result
	 * 
	 */
	public static void main(String[] args) {
		
		duplicatestring("JavaJavaJvaaJava");
		
		
		
		
	}
		
		
		
		
		
		public static void duplicatestring(String str) {
	
		
		String result="";//will print the values 
		for(int i=0;i<str.length();i++) {
			if(!result.contains(str.subSequence(i,i+1))) {
				result+=str.substring(i,i+1);
			}
		}
		System.out.println(result);
	}
}

