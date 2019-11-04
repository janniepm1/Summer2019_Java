package Day41initializerBlocks;

import java.util.ArrayList;
import java.util.Arrays;

public class staticBlockPractice {
	
	 public static String name;  // "suna" , "Erhan", "mehmet"
	    public static int[] arr1;
	    public static ArrayList<String> list = new ArrayList<>();
	    public static ArrayList<String> student=new ArrayList<String>();
	    public static String[] online= {"Arzigul","Me","Spike","Savas","Bahadhir"};
	    public static String[] inclass= {"Daryna","Nadire","Olga","Mizgin"};
	    
	    static double a=400;
	    
	    static {
	        name = "Erhan";
	        arr1 = new int[3];  //{0, 0, 0};
	        arr1[1] = 2;   // {0, 2, 0}
	        
	        list.add("Break");
	        student.addAll(Arrays.asList(online));
	    }
	    
	    
	    static {
	        name = "Suna";
	        arr1 = new int[5];  //{0, 0, 0, 0, 0};
	        arr1[0] =1;   // { 1, 0, 0,0,0}
	        arr1[2] =3;  //  { 1, 0, 3,0,0}
	        
	        list.add("Coffee");
	        list.add("Tea");
	        student.addAll(Arrays.asList(inclass));
	        
	    }
	    
	    
	    
	    public static void main(String[] args) {
	        staticBlockPractice obj1 = new staticBlockPractice();
	        
	        System.out.println(name);  // null
	        
	        System.out.println( Arrays.toString( arr1 ) ); 
	        
	        System.out.println(list);
	        System.out.println(student);
	        a=500;
	        System.out.println(a);
	    }
	    
	    
	    
	    
	    public staticBlockPractice(){
	        name = "Mehmet";
	    }
	}
