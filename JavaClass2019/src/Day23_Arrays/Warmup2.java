package Day23_Arrays;

public class Warmup2 {
	public static void main(String[] args) {
		//write a program that can find the unique characters from a string 
		//input: aaabbbcccdeee
		//output:bcd=====happens only one time
		String str="AAABCDEEEFF";
		String Unique="";
		
		
		
 for (int j=0; j<str.length();j++) {
		int count=0;
		for(int i=0; i< str.length(); i++) {
			if(str.substring(i,i+1).equals(""+str.substring(j,+1))) {
				count++;					//or ""+str.charAt(j)
			}
		}
		
		
		if(count==1) {
			Unique+=""+str.charAt(j);
		}
	}
 System.out.println("Unique characters are "+Unique);
	}
}
