package Day15Scanner_StringClass;

public class StringMethods {
public static void main(String[] args) {
	
	String str="Cybertek";
	//index num; starts from 01234567
	//charAt(index)
	System.out.println(str.charAt(4));
	char ch=str.charAt(4);
	System.out.println(ch);
	String str2="Mu htar";
	System.out.println(str2.charAt(2));
	//String methods:charAt (indexnum);it takes the index number and returns its character as char value
	//lenght()	:returns you total number of characters as int value
	String name="Donald J Trump";
	System.out.println(name.length()); //int n=name.length()	
	
	//concat(str):
	String s1="Cybertek";
			s1.concat(" School");// its going to display the original because it can't be modified
System.out.println(s1);// 1rst step is not going to change the datatype.

 s1=s1.concat("School");// you can change it only if you assign it to a new value
 System.out.println(s1); //Cybertek School
 
 //toupperCase(): converts to upper case 
 String n="cybertek";
 		n.toUpperCase();//cybertek wont change because string is inmutable
 System.out.println(n);
 n=n.toUpperCase();
 System.out.println(n);
 
 
 
 /*
  * charAt(index),length(), con
  * 
  */
 String a="Batch12 Javengers";
 
 System.out.println(a.charAt(9));
 
 char ch1=a.charAt(11);
 System.out.println(ch1);
 
 
 int Length=a.length();
 System.out.println(Length);
 
 int HighestInexNum=a.length()-1;
 System.out.println(HighestInexNum);
 
 int LowestInexNum=a.length();
 System.out.println(LowestInexNum);
 
 String b="Cybertek";
 b.concat("Batch12 Javengers");
 System.out.println(b);
 String c =b.concat("Batch12 Javengers");//"cybertek batch12 javengers "
 System.out.println(c);
 b=b.concat("Batch 12 Javengers");
 System.out.println(b);
 
 /*
  * concates the value to the variables valur and then returns a NEW string value
  */
 
 String d="book";
    System.out.println(d.toUpperCase());// upper case
      
      System.out.println(d);// book
      
     d= d.toUpperCase();
     System.out.println(d);//BOOK
     
     
     /*
      * TOUPPERCASE() method converts the new string value to upper case and returns it as a new string
      */
     
      String e="JAVA IS FUN";
              e= e.toLowerCase();
               System.out.println(e);// it will still give you upper case
               String f= e.toLowerCase();
               System.out.println(f);
               /*
                * tolower case method converts string value to lower case and returns it as a new string value
                */
 
 
 
 
 
 
 
 
 
 
	


}
}
