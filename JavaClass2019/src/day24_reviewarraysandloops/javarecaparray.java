package day24_reviewarraysandloops;

public class javarecaparray {
public static void main(String[] args) {
	/*
	 * Array declarations;
	 *DataType[] Variablename=
	 *{value1,value2.....
	 * 	 */
	int ar=10;
	int[] arr= {10,20,30};
	
	int arr2[]= {10,20,30};
	
	char[] arr3= {'A','B','C'};
	
	String arr4[]= {"Ibrahim","Filiz","Aysel"};
	//arrays store multiple values
	//Arrays does have index numbers, in order to retrieve a single value from 
	//array:
	//		VariableName[indexNum of value]
	//String name=arr4[3];index 3 does not exist 
//initialize the size of array;   int[] arr=new int[size]
	float[] myNums =new float[5];
	for(int i=0;i<myNums.length;i++) {
		System.out.println(myNums[i]);
	}
	/*
	 * default values:
	 * long,int,byte,int==0
	 * double and float=0.0\
	 * char==space
	 * String==num
	 */
	//Assign values:
	int ch[]=new int[3];
	ch[0]=10;
	ch[1]=20;
	ch[2]=30;
	//ch[3]=40;
	//ch=new int[4];
	for (int i=0;i<ch.length;i++) {
	System.out.println(ch[i]+"");//10,20,30
	}
	ch=new int[4];//reinitialized its side and previous values of arrays are lost
	for(int z=0; z<ch.length;z++) {
		System.out.print(ch[z]+"");//0000
		System.out.println();
	}
	int[] array1= {1,2,3};
	int[] array2= {4,5,6};
	
	   for(int i=0; i < ch.length; i++ ) {  
           System.out.print(ch[i]+" ");  // 10 20 30
       }
       System.out.println();
       
       
       
       
       ch = new int[4];  
  // reinitialized it's size,  and preveious values of array are lost
       
       for(int i =0; i < ch.length; i++) {
           System.out.print(ch[i]+" ");  // 0 0 0 0
       }   // array's size is fixed
       
       System.out.println();
      
       
      
       
       int[] array3 =  new  int[ array1.length + array2.length ];
//now this array has enough capacity to contain all the elements of array1 and array2
          for(int i=0; i < array1.length; i++ ) {
                      array3[i] = array1[i];
                      // assigning all value of array1 to array3' first 3 indexs
          }
       
       for(int i =0; i < array2.length; i++) {
              array3[ i + array1.length]  = array2[i]; 
              // assigning all the values of array2 to array3' remaining index
       }
       
  
       for(int i=0; i < array3.length; i++) {
           System.out.print(array3[i]+" ");
       }
       
       
       
       
       
       
       
       
      
      
  }
}


