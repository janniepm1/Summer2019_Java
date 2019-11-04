package Day21_whileLoops;



public class exercise2loops {
	public static void main(String[] args) {
		/*
		 * write a java program that can remove duplicated values
		 * string 
		 * input :aabbbcc
		 * output;abc
		 */
		
	String s1="aabbccdddeeepppggg";
	//i
	//    (0,1)
	//     (i,i+1
	String result="";//abc
	
	for(int i=0; i< s1.length();i++) {
		if(!result.contains(s1.substring(i,i+1) )) {
			//							(5,6)==>c
			//if char
			//if (!result.contains(""+s1.charAt(i))){
			result+=s1.substring(i,i+1);
		}
	}
	System.out.println(result);
	}

}
