package Day22_nestedloop;



public class warmup {
	public static void main(String[] args) {
		/*
		 * print num from 1-30
		 * for num divisible by 3 print fin
		 * for num divisible by 5 print ra
		 * divisible by both print ffindra do not use loop
		 * ALL FOR LOOPS CAN BE CONVERTED TO WHILE LOOPS
		 */
		//for (int i=1; i<=30;i++) {
		//}
		String str="";
		int x=0;
	 while (x<=30) {
		 
	  if (x%3==0 && x%5==0) {
		 str+="FINRA ";
	  }else if(x%3==0) {
			 str+="FIN ";
		 }
		 else if (x%5==0){
			 str+="RA ";
		
		 }else{
			 str+= x+" ";
		 }
		 x++;
		 }
	 //ternary
	 str +=(x%3==0 && x%5==0)? "FINRA":
		 (x%3==0)?"FIN": 
			 (x%5==0)?"RA": x+"";
	 x++;
	
	 System.out.println(str);
	  
		 
	}	
	
}
