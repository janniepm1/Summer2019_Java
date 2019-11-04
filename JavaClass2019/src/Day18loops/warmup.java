package Day18loops;

import java.util.Scanner;

public class warmup {
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter username: ");
		String username=scan.nextLine().toLowerCase();
		System.out.println("Enter your password ");
		String password=scan.nextLine();
		String username1="cybertek.batch12@gmail.com";
		String password2="Javengers";
		
		if (username.endsWith("@gmail.com")) {
			
			if(username.equalsIgnoreCase(username1)&& password2.equals(password2)) {
				System.out.println("logged in successfully");
			} else {
				if (!username.equalsIgnoreCase(username1)&& !password2.equals(password2)) {
					System.out.println("both username and password are incorrect");
				} else if (username1.equalsIgnoreCase(username1)) {
				System.out.println("Its not a valid username");
			}
		else {
			System.out.println("Its not a valid email address");
		}
		
		
		
		}
		
		}
	}
}

