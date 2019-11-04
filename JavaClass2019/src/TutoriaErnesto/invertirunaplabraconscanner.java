package TutoriaErnesto;

import java.util.Scanner;

public class invertirunaplabraconscanner {
	public static void main(String[] args) {
		
		
		String word="", RevWord="";
		int WordLength=0;
		Scanner EnterW=new Scanner(System.in);
		
		System.out.println("Enter a word or sentence");
		word=EnterW.nextLine();
		
		WordLength=word.length();
		
		while(WordLength!=0) {
			RevWord+=word.substring(WordLength-1,WordLength);
			WordLength--;
		}
		System.out.println(RevWord);
		
		
		
	}

}
