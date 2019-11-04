package day29Returnmethod;

public class frequencyofcharcters {
	public static void main(String[] args) {
		//return method,method overloading 
		//return method
		
		
		//interview question
		//warm up write a method that can find the frequency of characters in string
		//ex: frequency test(xxx,yyy,zzz)
		//			3x3y3z
		
		//Harder way to do it 
		String str="aabbaaabbbcccc";
		//	expected result a5,b5,c5
		//	letters :abcd
		String Removeddup="";//store the non duplicated values of the str
		for(int i=0;i<str.length();i++) {
			if(!Removeddup.contains(str.substring(i,i+1))) {
				Removeddup+=str.substring(i,i+1);
			}
		}
		System.out.println(Removeddup);//result=abc
							//			j,j+1
		String result="";//to store the expected result 
		for(int j=0;j<Removeddup.length();j++) {
		int count=0;//count the numbers of appearance
		for(int i=0;i<str.length();i++) {
			if(str.substring(i,i+1).equals(Removeddup.substring(j,j+1))) {
				count++;
			}
		}
		result+=Removeddup.substring(j,j+1)+count;//concate character and number to the string result
		}
		System.out.println(result);
	
		//solution 2
		
		String input="xxxyyyzzz";
		//expected result : "x3y3z3";
		//			letters:"xyz";
	
		String nonduplicate="";//remove the duplicates from input, and store it
		for(int i=0;i<input.length();i++) {
			if(! nonduplicate.contains(""+input.charAt(i))) {
				nonduplicate+=""+input.charAt(i);
				
			}
		}
		String expectedresult="";
		System.out.println(nonduplicate);
		
		for(int j=0;j<nonduplicate.length();j++) {
		int times=0; //count the occurrence of x 
		for(int i=0; i<input.length();i++) {
			if(input.substring(i,i+1).equals(nonduplicate.substring(j, j+1))) {//
				//input.charat(i)==nonduplicates.charat(j)
				times++;
			}
		}
		expectedresult+=nonduplicate.substring(j, j+1)+times;
		//				nonsuplicates.charat(j)+times
		
		
		}
		
		
		System.out.println(expectedresult);
		
		
		
		
		
	}
	}

