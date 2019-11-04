package Day32_review_methods;

public class duplicatesletters {
public static void main(String[] args) {
	String dup="cajsbdjjhasdkjbcalksjdbhlkbhksadv";
	int count=0;
	String nonduplicate="";
	 for(char i=0;i <=127;i++) {
		 
		 for(int j=0; j<dup.length();j++) {
			 
			 if(i==dup.charAt(j)) {
				 count++;
			 }
		 }
		 if(count==1)
			 nonduplicate+=i;
		 if(count>1)
			 
		 System.out.println(i+ " Ocurres "+count+" times");
	 }
}
}
