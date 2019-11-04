package day08_ShortHandOperators;

public class logicalOperators {
	public static void main(String[] args) {
		/*
		 &&: and logic == > true && true== >true if both conditions are true will return true 
		 
		 ||: or logic  	TRUE||FALSE==> TRUE
		 				TREU|| TRUE==>TRUE 
		 				FALSE||FALSE==> FALSE
		 				IF BOTH CONDITIONS ARE FALSE IT WILL RETURN FALSE, OTHERWISE IT WILL BE TRUE
		 */
		
		boolean resultA =9==0 && "Muhtar"=="good";
		//				false      false==>false
		System.out.println(resultA);
		
		boolean resultB= (8> 5) && (7 == (8-2+1));
		//					true && true ==>true
		System.out.println(resultB);
		
		boolean resultC= ((!false !=true) && (!false ==!true));
		//               true != true    && true ==false
		//              false			&& true ==> false
		System.out.println(resultC);
		
		
		// ||:
		 boolean A=("monday"=="fun-day");
		 System.out.println(A);
				 
		
	 
		
		

		
		
		
		
	}
	}
