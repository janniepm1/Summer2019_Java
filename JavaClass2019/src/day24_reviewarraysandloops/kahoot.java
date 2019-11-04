package day24_reviewarraysandloops;

public class kahoot {
	public static void main(String[] args) {
		 int i=5;//4
		 do {
			 i--;
			 System.out.print(i+"");//4 3 2 1 0
			 
		 }while(i>0);
		 
		 System.out.println();
		 int x;
		 int y=5;
		 for(x=0; x<y; x++) {//x==3
			 System.out.println((x+=2)+" ");// loops body gets executed because x<y
		 }//						2
		 
		 System.out.println();
		 int a=10;//10+0=10+1 11+2 
		 for(int b=0; b<=5; b++) {//b=1 2 3 4 5
		 a+=b;
		 
	}
		 for(int c=0; c<5; c++) {
			 System.out.println(c+"");
			 break;
			// System.out.println(); if you put anything after brake will give you error
		 }
		 System.out.println();
		 
	String str="Java";
	String str2=new String(str);//java
	System.out.println(str==str2);//false different location
	
	
	System.out.println(str.equals(str2));//true because only conpares visible text not locations
	
	int count=10;
	do{
		count+=2;//if we use while instead of do it will print 10
	}while(str==str2);//never gets executed do while is executed first
	
	System.out.println(count);//12
	
	String str1="    ";
	str.trim();
	int n1=0;
	while(str.isEmpty()) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
