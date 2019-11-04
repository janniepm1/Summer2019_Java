package wrapperclassandarrylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArraysListPractice2 {
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		for(int i=0; i<=30; i++) {
						if(i%2!=0) {
							continue;//i%2==0==even nums
							//i%2!=0
						}
				list.add(i);
			
						
		}	
		System.out.println(list);//full list even nums
		System.out.println(list.size());//16
		System.out.println(list.get(4));//8
		
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+",");
		}
		
		//same result shorter way
		System.out.println();
		for(Integer each:list) {//unboxing
			System.out.print(each+" ");
		}
		System.out.println();
		int num =list.get(7);//unboxing there is no primitives in arrays
	
		//list.clear(); if you use clear everything will be lost
		
		System.out.println(list.get(2));
		
		
		//sorting the array list:
		ArrayList<Integer> list2 = new ArrayList<>();
        
        for(int i=20; i >= 0; i--) {
            list2.add(i);
        }
    
    System.out.println(list2);
    
    
    // sorting the arraylist:
                    Collections.sort(list2);
                System.out.println(list2);
    
                
    
    
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
