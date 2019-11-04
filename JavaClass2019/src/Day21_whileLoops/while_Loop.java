package Day21_whileLoops;

public class while_Loop {
	/*
	 * while loop: while (condition){
	 * statements;
	 * loops gets executed as long as he condition is true.
	 * a repeating if statement 
	 * the compiler first checks the conditions of while loop, if its true 
	 * executes the loop,otherwise stops executing.
	 * 
	 */
public static void main(String[] args) {
	
	int a=9;//a=8
	while (a>8) {
		
		System.out.println("Hello "+a);
		a--;
		
	}
	
	
	
	
	/* 
	 * write a java program that can count how many time the word book appears
	 */
	
	
	String sentence="Ilike book,I read book";
	int count=0;
	
	while(sentence.contains("book")) {
		count++;
		sentence=sentence.replace("book","");
	}
	System.out.println(count);// replace all the "book" word
	
	//if you want to remove only one word
	
	
	String sentence1="I like book,I read book,book ,book ,book";
	int count1=0;
	
	while(sentence1.contains("book")) {
		count1++;
		sentence1=sentence1.replaceFirst("book","");
	}
	System.out.println(count1);
	System.out.println(sentence1.replaceAll(",",""));
	
	
	
	//break:exits the switch statement and loop forcefully and exits the loop
	
	while (true) {
		System.out.println("hello");
		break; //forcefully exists the loop
	} int i=0;
	 while(true) {
		 
		 i++;
		 System.out.println("Hello:"+i);
		 if (i==5) {
			 break;
		 }
	 }
	//any for loop can always be converted to while loop 
	 /*
	  * initialization;
	  * while(condition);{
	  * statements;
	  * iterator
	  */
	 
	//print even num1-100
	 for (int z=1; z<=100; z++) {
		 if(z%2==0) {
			 System.out.print(z+" ");
		 }
	 }
	 
	 /*
	  * converting for loop to while loop;
	  * initialization;
	  * while(condition){
	  * statement;
	  * iterator
	  */
	 
	 
	 
	 
	  int s=1;
	  while(s<=100) {
			  
		  if(s%2==0) {
		System.out.print(s+" ");	  
		  }
		  s++;
			  }
	  
	  
	  
}
}
