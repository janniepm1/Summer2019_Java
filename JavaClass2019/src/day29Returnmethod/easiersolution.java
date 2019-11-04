package day29Returnmethod;

public class easiersolution {
	public static void main(String[] args) {
		
		String str="aabbccdd";//expected result a2b2c2d2
		
		String expectedresult="";
		
		
		for(int j=0; j<str.length();j++) {
		int count=0;
		for(int i=0; i<str.length();i++) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
			}
		}
		//System.out.println(count);
		expectedresult+=""+str.charAt(j)+count;
		str=str.replaceFirst(""+str.charAt(j),"");//after adding the str.charat(j),
		
		}
		System.out.println(expectedresult);
	}

}
