package repl_it;

import java.util.Scanner;
public class sms_message {
	public static void main(String[] args) {
	/*
	 * We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}

Variables are already declared:

sender, phoneNumber, messageBody
- by using String methods:
retrieve related information from SMSmessage string and assign to those 3 variables.
-print each variable in separate line

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programing and problem solving

	 */
		 Scanner scan = new Scanner(System.in);
		System.out.println("enter message");
		   String message = scan.nextLine();
		    String sender;
		    String phoneNumber;
		    String messageBody;
		
		    System.out.println("Sender: " + message.substring(message.indexOf("<")+1,message.indexOf(">"))) ;
		    System.out.println("Phone Number: " + message.substring(message.indexOf("[")+1,message.indexOf("]")));
		    System.out.println("Message body: " + message.substring(message.indexOf("{")+1, message.indexOf("}")));
		    
		    
		    
		    
	}}
		   