package String_continue;

public class StringMethods {
	public static void main(String[] args) {
		/*
		 * indexOf(str):returns the index number of the first character  in the given string
		 * string as an int value
		 */
		
		String a1="Batch12 is a great batch";
		int num=a1.indexOf("g");
		System.out.println(num);
		
		int num2=a1.indexOf("eat ");//16
		//negative number means str doesnt exist in the string
		System.out.println(num2);
		String b1="today is Tuesday, today we have class in the afternoon";
		int b2=b1.indexOf("ter");//returns first characters 
		System.out.println(b2);
		
		String Address=" 7925 Jones BranchDr,Mclean,VA 22003";
		int begin=Address.indexOf(",")+1;//2
		int end=Address.indexOf(",V");
		
		String cityname=Address.substring(begin,end);
		System.out.println(cityname);
		
		String email="RandomEmails@gmail.com";
		int begin2=email.indexOf("@")+1;
		int end2=email.indexOf(".com");
		String emailtype=email.substring(begin2,end2);
		System.out.println(emailtype);
		
		
		/*
		 * lastindexof();returns the last ocurred character index
		 * number as aand int value
		 */
		String str="ABCDABCD";//indexof 1 lastindexof 5
		int n3=str.lastIndexOf("B");//its better if you use string but you can also use char
	
		System.out.println(n3);
		
		String myEmail="myemail.school@gmail.com";
		int begin1=myEmail.indexOf("@");
		int ending=myEmail.lastIndexOf(".");
		String myemailtype=myEmail.substring(begin1,ending);
		System.out.println(myemailtype);
		
		
		/*
		 * isEmpty:checks if the string
		 */
		
		
	}

}
