package Day34arraylis_constr;

import java.util.ArrayList;

public class warmupremovedup {
	
	    /*
	     Warm up:
	    1. write  a return method that can remove duplicates from a string
	        Ex: RemoveDup("abcabc") ==> returns "abc";
	    2. write a return method that accepts two parameter Strings a and b, 
	            and returns the total numbers of apperence of string b in String a
	            
	                Ex: count("abcaba", "a")  ==> returns 3 ;
	    3. use the above two methods to write a new method that can find the frequency of characters
	        Ex: frequency("aabcabcabc") ==>a4b3c3
	    4. write a return method that can find the maximum number from an Integer arrayList   (DO NOT use sort methods of Collections class)
	    5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)
	     */
	    
	    public static void main(String[] args) {
	        //task01
	        String a = RemoveDup("abcabcdefdef");   // "abc"
	        
	        System.out.println(a);
	        System.out.println( RemoveDup("abcabcdefdef") );
	        
	        
	        // task02
	        int count  = appearencecount("abaacdabcdaaa", "c");
	        System.out.println(count);
	        
	        System.out.println( appearencecount("abaacdabcdaaa", "a"));
	        
	        //task 3
	        System.out.println(frequency("abcabcbajbcabcba"));
	        
	        //task4'
	        ArrayList<Integer> list=new ArrayList<Integer>();

	        list.add(8912);
	        list.add(20);
	        list.add(1000);
	        list.add(30);
	        list.add(2030);
	        int num=maximum(list);
	        System.out.println(num);
	        //task 5
	        ArrayList<Integer> list2=new ArrayList<Integer>();
	         
	        list2.add(31893);
	        list2.add(2894);
	        list2.add(1934);
	        list2.add(-3);
	        list2.add(-1248);
	        list2.add(1);
	        int num2=minimum(list2);
	        System.out.println(num2);
	        
	    }
	    
	    
	    // task01
	    public static String RemoveDup(String str) {
	                                    //"abcabc"
	        String result = "";
	        for(int i=0; i < str.length(); i++) {
	            if( ! result.contains( str.substring(i, i+1) ) ) {
	                result += str.substring(i, i+1);
	            }
	        }
	        
	        return result;
	    }
	    
	    
	    // task02
	    public static int appearencecount(String str1, String str2) {
	                            // abab        a   ==>1
	                            // bab          a  ==. 2
	            
	        int count=0;  //  to count how many time b is appeared in a
	        
	        while(str1.contains(str2)) {
	            count++;
	            str1 = str1.replaceFirst(str2, "");
	        }
	            
	        return count;   
	        
	    }
	    
	    
	    // task03
	    public static String frequency(String str) {
	                                // "abcabcabc"  ==> "a3b3c3"
	                                    
	        String nonDup = RemoveDup(str); // "abc"
	        String result = "";  // to store the expected result
	        
	        for(int i=0; i < nonDup.length(); i++) {
	                int count = appearencecount( str ,  ""+nonDup.charAt(i) );
	                result += "" + nonDup.charAt(i) + count;
	        }
	            
	        return result;
	    }
	    //	    4. write a return method that can find the maximum number
	    //from an Integer arrayList   (DO NOT use sort methods of Collections class)
public static int maximum(ArrayList<Integer> list) {
	int max=Integer.MIN_VALUE;
	
		for(int each:list) {
			if(each> max) {
				max=each;
			}
		}
	
	
	
	return max;
}
	    
	    
	    //	    5. write a return method that can find the minimum number from an Integer arrayList     (DO NOT use sort methods of Collections class)
public static int minimum(ArrayList<Integer>list2) {
	
	int minimum=Integer.MAX_VALUE;
	
	for(int each1:list2) {
		if(each1<minimum) {
			minimum=each1;
		}
		
	}
	return minimum;
}
	    
	    
	}

	    
	




	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


