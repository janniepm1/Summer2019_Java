package Day_26for_each;

import java.util.Arrays;
import java.util.TreeSet;

public class warm_up {
	/*
	 * Warm up:
    1. write a program that can check if two Strings are build out of same letters
    Ex: 
        if str1 = "aabbbc";  str2 ="cab";
        output: true
        if str1 ="abcd";  str2 ="abc";
        output: false
	 */
public static void main(String[] args) {//remove duplicates from string 
	String a="aabbbc", b="cabbbscsdcsdffasf";//how to remove duplicate from string
	//abc
	String a1="";//store all the non duplicate values
	
	for(int j=0; j<a.length();j++) {
	for(int i=0; i<a.length();i++) {
		if(!a1.contains(a.substring(j,j+1))) {
			a1+=a.substring(j,j+1);
		}
		
	}	}
	System.out.println(a1);
	System.out.println();
	
	//if you want to print only one characters from a string
	String b1="";

		for(int i=0; i<b.length();i++) {
			if(!b1.contains(b.substring(i,i+1))) {//i=0
				//(!b1.contains(""+b.charAt(i)
				b1+=b.substring(i,i+1);
			}
		}System.out.println(b1);
	
//TERNARY OPERATOR
//A1="ABC  , B1="CAB";
		
		char[] ch1=a1.toCharArray();
		System.out.println(Arrays.toString(ch1));
		char[] ch2=b1.toCharArray();
		System.out.println(Arrays.toString(ch2));
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println("=============");System.out.println(Arrays.toString(ch1));
		System.out.println(Arrays.toString(ch2));
		
		String str1=Arrays.toString(ch1);
		String str2=Arrays.toString(ch2);

		
		if (str1.equals(str2)) {
			System.out.println("true they are built with the same letters");
		}else {
			System.out.println("false they are not build of the same letters");
		}
		//solution
		String Str1="aaabbbccc", Str2="cccaaabbb";
		//Str1=new TreeSet()<String>(Arrays.asList(Str1.split(""))).toString();
		//Str2=new TreeSet()<String>(Arrays.asList(Str2.split(""))).toString();
		
		//System.out.println(Str1.equals(Str2));
		
		}

}