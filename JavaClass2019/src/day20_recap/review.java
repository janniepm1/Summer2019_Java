package day20_recap;

import java.util.Scanner;

public class review {
	public static void main(String[] args) {
		//for(char ch='a'; ch<='z';ch++) {
		//	System.out.print(ch+""+",");
		
		//substring, indexof, leastindexof,replace,replcaefirst,equals
		//equalignorecase,contains,startswith,ednswith,
		//charat,trim,lenght,concat,isempty,touppercase,tolowercase
		
			
		//substring:creating the sub value of the string ending index is included
			
	String str="Cybertek School"; //String literals
	
	str=str.substring(0,str.indexOf("k")+1);
	System.out.println(str);//cybertek
	
	String str2="Cybertek School";
	str2=str2.substring(str2.indexOf("S"));
	System.out.println(str2);//school
	
	
			
			
			//index of:returs the first occurs values index num
	String s1="Java is a fun language, i love java, java,";
	System.out.println(s1.indexOf("a"));//1
	
	System.out.println(s1.indexOf("ag"));//19
	
	//lastindexofmethod():returns the last occured char's index num
	System.out.println(s1.lastIndexOf("a"));//40
	System.out.println(s1.lastIndexOf("ava,"));//38 
	
	
	//replace: replaces the old value with the new one
	
	String name="Cybertek School batch 12";
	int length= name.length();//givexs all the numbers including the spaces
	System.out.println(length);
	
	
	name=name.replace(" ","");
	System.out.println(name.length());
	name=name.replace("e", "a");
	System.out.println(name);
	
	name=name.replace("School","Family");
	
	
	//replacefirst: replaces the first occured character with the new one
	String a1="Java is fun,Java is a object oriented, java is cool";
	a1=a1.replace("java is o", "c++ is o");
	a1=a1.replace("Java is o","C++ is o");
	System.out.println(a1);//is going to replace all javas 
	
	
	
	/*
	 * ==,equals,equalsIgnorecase\
	 * 
	 */
	
	String r1="Cybertek";
	String r2=new String ("Cybertek");
	String r3=new String("Cybertek");
	System.out.println(r1==r2);//false
	System.out.println(r1.equals(r2));//true
	System.out.println(r1.equals(r3));
	System.out.println();
	
			//startswit& endswith =returns boolean
	
	String gmail="CybertelSchool@gmail.com";
	boolean r=gmail.endsWith("@gmail.com");
	System.out.println(r);
	
	Scanner scan=new Scanner(System.in);
	System.out.println("enter you email");
	String gmailadress=scan.nextLine().toLowerCase();
	if(gmailadress.endsWith("@gmail.com")) {
		System.out.println("its a valid gmail");
		
	}else {
		System.out.println("invalid email adrees.");
	}
	
	//starts with www. and ends with .com
	System.out.println("enter a web address");
	
	String url=scan.nextLine().toLowerCase();
	 
	if (url.startsWith("www.")&& url.endsWith(".com")) {
		System.out.println("its a valid email address");
	}else {
		System.out.println("its invalid web adress");
	}
	
	
	//contains:checks if the given value is contained in the string or not 
	// will return in boolean expression
	
	String Salary="1000$";
	boolean result2=Salary.contains("$");//true
	System.out.println(result2);
	
	
	//concat:concates 2 strings
	String Schoolname="cybertek";
	Schoolname=Schoolname.concat("schoool");
	System.out.println(Schoolname);
	
	String schoolname="cybertek"+1231;//concates any value to the string
	
	System.out.println(schoolname);
	
	
	
	
			
			
			
			
			
			
			
			
			
		}
	}


	
	



