package Day_13;

public class Switch_Statement {
	public static void main(String[] args) {
		//08/30/2019
	/*	Java Reveiw day: 
	        If statement
	        Switch Statement
	switch statement:
	        
	        switch(Expression){
	            case CaseValue :
	                    statement1;
	                    statement2;
	                    break;
	            case CaseValue : 
	                    statement1;
	                    statement2;
	                    break;
	            default:
	                    statement1;
	                    statement2;
	                    break;
	        }
	        we can have as many cases as you want
	        
	        caseValue MUSt match with the switch Expression' dataType
	        break statement: 
	            used for exiting the switch statement.
	            if we don't have break statement, code will continue to run till next break statement or }
	    case is similar with else-if
	    default section is similar with else statement
	    default section will get executed when there is no case that matches with the given Expression
	    after the break statement you cannot give more statement you can only give it before*/

		int num=5;
		switch (num) {
		case 7: 
			System.out.println("Sunday");
			break; //case closed
		//it's used for exiting switch statement after the case its executed 
			default://after default you cannot give any more statements
				System.out.println("Invalid entry");
				break;//exits the switch statement 
				//System.out.println("Wednesday");
			case 10-5://or 5 same thing 
				System.out.println("Friday");
				break;
		}
		
		
		String days="Tuesday";
		switch  (days) {
		case "Monday":
			System.out.println("Monday is fun day");
			break;
		case "Tuesday":
			System.out.println("Tuesday a great day");
			break;
		case "Wednesday":
			System.out.println("Wednesday is day off");
			break;
		case "Thursday":
			System.out.println("Thurday is java");
			break;
		case "Friday":
			System.out.println("Friday TGI");
			break;
			default:
				System.out.println("Invalid");
				
		}
		
	
		//switch statement expression must be evaluate to a single value (either character,digits or text) thereforce 4 datatyoes are not accepted
		//double a =10l, 10d, 10d;
		//float  a= 10f, 10f; double and float are not accepted, long , boolean are not accepted.
		 // can only use int , short, byte 
	//	long n1=10;
	//	switch (n1) {}
		
		//float n2=(int)100; //100.0f
	//	double n3=10;
	//	switch(n3) {}
		//boolean n4=true;
		
		char ch='A';
		switch(ch) {}
		char ch2=123;
		System.out.println(ch2);
		//or logic
		// there is not direct way of using || operator , we can use multiple case blocks back to back 
		//whenever you are writing code and cheking if some variable equals different values:
		// you can use multibranch if , and switch statement 
		String US="USA";
		if (US =="USA" || US =="America" ||US=="US") {
				System.out.println("American");
	} else {
		System.out.println("Not American");
	}
	switch (US) {
	case "US":
	case "USA":
	case "American":
		System.out.println("American");
		default:
			System.out.println("Not American");
		
		
		
	}
	}
}
		
		
		
		
		
		
		
		
		
		
	

	
