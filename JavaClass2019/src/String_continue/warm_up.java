package String_continue;

import java.util.Scanner;

public class warm_up {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first and last names");
		String firstname=scan.next();
		scan.nextLine();//takes out the enter from scanner
	
		String lastname=scan.nextLine();
	String initials=firstname.substring(0,1)//beginning index and ending index
				.concat(".")
	+lastname.substring(0,1);
		
	//	String initials =""+firstname.charAt(0)+"."+lastname.charAt(0);//""RETURNS TO STRING
		
		initials=initials.toUpperCase();
		System.out.println("Initial is:"+initials);
		int firstnameindex=firstname.length()-1;
		int lastnameindex=lastname.length()-1;
		
		String Lastletters=""+firstname.charAt(firstname.length()-1)
							+"."+lastname.charAt(lastname.length()-1);
		Lastletters=Lastletters.toUpperCase();
		String Lastletters2=firstname.substring(firstnameindex,firstnameindex+1)
				+lastname.substring(lastnameindex,lastnameindex+1);
		Lastletters2=Lastletters2.toUpperCase();
			System.out.println("Last letters are: "+Lastletters2);	
			
			
			// better if you use substring!!!!!!
	}

}
