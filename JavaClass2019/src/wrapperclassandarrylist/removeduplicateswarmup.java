package wrapperclassandarrylist;

public class removeduplicateswarmup {
	/*write a return methd that accepts a string and removes duplicates
	 * values from a string 
	 * write a method that accepts string and return the unique values from the string
	 * unique values 
	 */
	public static void main(String[] args) {
		String str=revDup("aaabbbccc");
		System.out.println(str);
		
		String str2=uniqueval("aabbcdee");
		System.out.println(str2);
	}
	
	
	
	
	public static String revDup(String str){
					//"aabbcc"
		String result="";//to store the non duplicated values
		for(int i=0; i<str.length();i++) {
			if(!result.contains(str.substring(i,i+1))) {
				result+=str.substring(i,i+1);
			}
		}
		return result;
		}
	
	//task 2 write a return method that return unique values from a string 
	public static String uniqueval(String str) {
								//"aabbcdee"===cd
		String result="";//to store unique characters
		//print the letter that only have one appearence
		
		
		for(int j=0; j<str.length();j++) {
	
		int count=0;//to count num of appearances
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		
		if(count==1) {//only the unique characters will be added to the result
			result+=""+str.charAt(j);
		}
	}
		return result;
}
	
	
	}



