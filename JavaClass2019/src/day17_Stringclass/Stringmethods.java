package day17_Stringclass;

import java.util.Scanner;

public class Stringmethods {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//string is an object there are 2 ways we can create string class object
		//1.string literals:string str="cybertek";
		//2.by using "new" keyboard string str=new String"cybertek
		//java heap :a memory location where all the objects will be saved at
		//string pool: very special memory location for string literals.
		//everytime if the string object is created by string literals the object will be saved at string pool
		//everytime if the string object is created by using "new" keyword dthe object will be saveed at heap memory
		// one memory location can be shared by muLtiple variables
		String str1="Hello javengers";
		String str2="Hello javengers";//THEY BOTH ARE GOING TO STRING POOL/public pool
		boolean r1=str1==str2;// true 
		System.out.println(r1);
		
		String str3=new String("hello javenger");//it will be store in java heap/its a private pool
		String str4=new String("hello javenger");
		boolean r2= str3==str4;//false because is new string 
		System.out.println(r2);
		
		boolean r3=str1==str3;//false different pools 
		System.out.println(r3);//one is heap memory one is in string pool
		 
		
		
		/*Methods;
		 * 1.concat.2.lenght 3.charAt 4,toUpperCase 5.toLowerCase
		 * concat(str):it takes string and conbines the two string 
		 * and returns it as new string value 
		 */
		String a="Cybertek";
		a.concat(" School");//new value "Cybertek school"
		//string is immutable cannot be modified.
		System.out.println(a);//still print cybertek
		a=a.concat(" School");//a =="cybertek school"
		System.out.println(a);//you reassign its value 
		
		/*String is sequences of characters:
		 * each character in the string has index num starts from 0
		 * length():it returns the total number of the characters as an int.
		 * 
		 */
		String Longname="abcdefghijklmn";
		int num=Longname.length();
		System.out.println(num);
		
		/*
		 * charAt(indexNum):it returns the character of the index number as a char value
		 * toUpperCase();converts the string value to upper case
		 * toLowerCase():converts string value to upper case
		 */
		String name1="Muhtar";
		char ch=name1.charAt(5);
		System.out.println(ch);//r,index5 is r
		
		String name2="cybertek";
		 name2.toUpperCase();
		 System.out.println(name2);//it stays lower letter
		 name2=name2.toUpperCase();// you changed its value by renaming it 
		
		 System.out.println(name2);
		String name3="CYBERTEK";
		name3.toLowerCase();//it wont change because its immutable
		System.out.println(name3);
		name3=name3.toLowerCase();
		System.out.println(name3);
		
		/*
		 *trim();its used for removing the unused spacesreturns a new string value
		 */
		String s1="                  hello                 ";
				s1.trim();
				System.out.println(s1);
		s1=s1.trim();
		System.out.println(s1);
		String s2="Cybertek      School";
		s2=s2.trim();
		System.out.println(s2);
		
		
		String s3="  ";
		s3=s3.trim();
		System.out.println(s3);
		
		String s4="        Cybertek      School";
		s4=s4.trim();
		System.out.println(s4);
		
		/*
		 * substring:(beginning index): it creates subvalue of string '
		    ,returns it as a next string value
		 * from the beginning index till the last index
		 */
		String str="Cybertek School";	
					//0123456789
		String str5=str.substring(9);//school
		System.out.println(str5);
		
		String address="Mclean,VA 22000 ";
		//				0123456789
		String zipcode=address.substring(10);
		System.out.println(zipcode);//will print just the zipcode
		
		
		/*
		 * substring (beginning index,ending index):
		 * it creates the sub value of the string from the beginning index till the
		 * ending index (ending index num will be excluded)
		 * then returns it as a new string value 
		 */
		
		String name="Hello Cybertek School";
		//			012345678910
			name=name.substring(6,14);//cybertek or you can and 13+1
			System.out.println(name);
			
			String fullname="Cybertek school Batch12";
			String middlename= fullname.substring(9,15);//or it could be 14+1
			System.out.println(middlename);
			
			/*
			 * replace(old char,new char);
			 *
			 */
			
		
		
		
		
		
		
		
		
	
	
	}
	

}
