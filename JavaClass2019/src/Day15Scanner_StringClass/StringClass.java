package Day15Scanner_StringClass;

public class StringClass {
	public static void main(String[] args) {
		//string creates an object from memory location in java. 
		//strings will be stored in string pool
		//string class;
		//1.string literals =="Cybertek"
		//2 by using new keyboard String str=newString("Cybertek")
		//string pool doesnt take duplicates
		//when the string object is created by using new word. the object will be saved at java heap memory
		//not within .
		//everytime when we use a new keyword,compilers will create a new object in java heap memory
		//heap memory ;the place where all the objects are store
		
		String str="Cybertek";
		String A="Cybertek";
		String B="Cybertek";
		System.out.println(A==B);
		
		String str2=new String("Cybertek");
		System.out.println(str==str2);
		
		String str3=new String("Cybertek");
		System.out.println(str2==str3);
		
		
		
		String s1="cat";
		String s2="cat";
		System.out.println(s1==s2);//same memory locations
		
		String s3=new String("cat");
		String s4= new String("cat");
		System.out.println(s3==s4);//different memory locations
		
		String a= "Batch12";
		String b= "batch12";
		System.out.println(a==b);//not equal because java is case sensitive
		
		String c=new String ("Cybertek");
		String d=new String ("cybertek");
		System.out.println(c==d);
		
		//2. string object represents the sequenses of characters ==>"ABCDEFG"
		//EACH CHARACTER IN STRING HAS ITS OWN INDEX NUMBER .INDEX NUMBERS STARTS FROM 0
		//index number :01234567
		//3.String is immutable; once you declare it you cannot modify it
		//String methods 
		/* charAt(indexnum):
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
	}
}
