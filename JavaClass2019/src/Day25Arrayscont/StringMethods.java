package Day25Arrayscont;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {
	public static void main(String[] args) {
		/*
		 * split(str);split the string by the given value, and returns it as String array
		 *
		 */
		String sentence="Today is great day, Good day to learn java";//gives you a coma after every word
		String[] arr=sentence.split(" ");
		System.out.println(Arrays.toString(arr));
		
		String email="FirstName_LastName";
		String[] arr2=email.split("_");
		String str=Arrays.toString(arr2);
		System.out.println(str.replace("[","").replace("]",""));//get rid of brackets
		
		
		String fullname="Cybertek School Batch12";
		String[] array1=fullname.split(" ");//will separate names with coma
		System.out.println(Arrays.toString(array1));
		
		String Java="I love Java and Java is fun, Java is life, Java is life";
		String[] Java2=	Java.split("Java");
		System.out.println(Arrays.toString(Java2));
		System.out.println(Java2.length-1);//how many java is contains in a sentence is going to split java 3 times 
		//it will start splitting when encounter java
		String Python=" Python is good, I love Python, Python is life ";
				   // [ | is good, I love |,   | is life]
		String[] array3=Python.split("Python");
		System.out.println(array3.length-1); //returns total number of python in string
		
		String emailAdress="Cybertek.school.batch12@Gmail.com";
		String fullname2=emailAdress.substring(0,emailAdress.indexOf("@"));
		System.out.println(fullname2);//Cybertek.school.batch12
		String[] allNames=fullname2.split("\\.");//you have to give slash 
		System.out.println(Arrays.toString(allNames));
		
		String word="ABCDEFG";
		String[] endofword=word.split("");//all the char will be return as array,splits the string character by character
	System.out.println(Arrays.toString(endofword));// will separate the letters by a coma
	
	
	}

}
