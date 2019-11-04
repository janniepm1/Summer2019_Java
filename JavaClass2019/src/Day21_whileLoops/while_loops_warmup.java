package Day21_whileLoops;

public class while_loops_warmup {
	/*
	 * write a program that can count how many time the word book is appeared in a string
	 * output: i like books, have books i nned book
	 * output:3
	 */
public static void main(String[] args) {
	String sentence="I like books, I have books , I need books";
	//index:    			z, z+4==>book
	int count=0;
	for(int i=0;i<sentence.length()-3;i++) {
		//			17   highest value has to be 16
		if(sentence.substring(i,i+4).equals("book")) {
		
			//substring(0,4)
			count++;
	}
	}
	System.out.println(count);
	
	
	String sentence2="I like book, I have book, I nedd book , I buy book,book ,book";
	//index:    			z
	int count2=0;
	for(int z=0; z<sentence2.length()-3;z++) {
		if(sentence2.substring(z,z+3+1).equals("book")) {
			//0
			count2++;
		
			
			
		}
	}
	
	System.out.println(count2);
	String words="Cybertek is school,Cybertek is great, I love Cybertek";
	
	int nTime=0;
	
	for (int j=0; j<words.length()-7;j++ ) {
		//           54
		if(words.substring(j,j+8).equals("Cybertek")) {
			//              53,61
			nTime++;
		}
	}
	System.out.println(nTime);
	
	
	
	
	
	
	
		
	
}
}
