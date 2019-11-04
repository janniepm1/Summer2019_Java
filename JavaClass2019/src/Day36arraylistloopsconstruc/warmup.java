package Day36arraylistloopsconstruc;

import java.util.ArrayList;
import java.util.Arrays;

public class warmup {
	public static void main(String[] args) {
		/*
		 * 1.write a return method that can remove the duplicated objects
		 * from an integer arrayList
		 * 2.write a return method that can remove the duplicated objects
		 * from a string arraylist
		 * 3.write a return method that can remove duplicated objects 
		 * from a character arraylist
		 * 4. write a return method that can remove the duplicated objects
		 * from a double arraylist
		 */
		//warmup1
		  
		        ArrayList<Integer> list = new ArrayList<>( Arrays.asList(1,1,2,2,3,3) );
		        System.out.println(list);
		        
		        list = RemoveDup(list);  //[1,2,3]
		        
		        System.out.println(list);
		        
		        
		    ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4,4,5,5,6,6));
		        System.out.println(list2);
		        
		            list2 = RemoveDup(list2);
		            
		            System.out.println(list2);
		            
		        //task02:
		        String[] names = {"Sherinay", "Denis", "Nurzat", "Seyfo", "Seyfo", "Seyfo", "Mehmet"};
		        ArrayList<String>  list3 = new ArrayList<>( Arrays.asList( names ) );
		        System.out.println(list3);
		        
		        
		        list3 = RemoveDup2(list3);
		        System.out.println(list3);
		        
		    }
		    
		    
		    
		    // task01:
		    public static ArrayList<Integer> RemoveDup( ArrayList<Integer> list ){
		                                                    //[1,1,1,2,2,2,3,3,3]
		        ArrayList<Integer> result = new ArrayList<>();  //[1,2,3]
		        
		        for(int i=0; i < list.size(); i++ ) {
		            if( ! result.contains( list.get(i) )  ) {
		                result.add( list.get(i)  );
		            }
		        }   
		            
		        /*
		        for( Integer each  :  list ) {
		            if( ! result.contains(each) ) {
		                result.add( each );
		            }
		        }
		        */  
		            return result;
		    }
		        
		    
		    // task02:
		    public static ArrayList<String>  RemoveDup2 ( ArrayList<String>  list ){
		        ArrayList<String> result = new ArrayList<>();  //[1,2,3]
		        
		        for(int i=0; i < list.size(); i++ ) {
		            if( ! result.contains( list.get(i) )  ) {
		                result.add( list.get(i)  );
		            }
		        }
		    
		        return result;
		    }
		}
		




	
	
		
		
		
	


