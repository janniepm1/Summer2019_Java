package repl_it;

import java.util.Arrays;

public class bbb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	  
	  public static String[] getWithE(String[] arr) {
	    
	    //TODO : YOUR CODE GOES HERE ----------------------
	    String str="";
	    for(int i=0;i<arr.length;i++){
	      if(arr[i].contains("e")){
	        str+=arr[i]+" ";
	      }
	    }
	    String[] fewValues=str.split(" ");
	  System.out.println(Arrays.toString(fewValues));
	    
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }
	  
}
