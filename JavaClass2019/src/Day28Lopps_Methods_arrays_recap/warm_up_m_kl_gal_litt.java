package Day28Lopps_Methods_arrays_recap;

import java.util.Arrays;

public class warm_up_m_kl_gal_litt {

		/*
		 * write a method that can convert km to miles 1km=0.612 miles
		 * write a method that can convert gallons to litters 1gal=3.75l
		 
		 */
		//write a method that can convert km to miles
	
	//Strng methods==returns values
	
	public static void main(String[] args) {
	//	kmtomiles()//not enough info for the method to perform its task
		kmtomiles(1000);//10.0
		gallonstolitters(10);
		int[] arr= {0,-1,1000,2000,5000};
		sortdes(arr);
	}
	
	public static void kmtomiles(double km) {
			double miles=km*0.612;
			System.out.println(km+" km equals to " +miles+" miles");
		}
		
	public static void gallonstolitters(double gallons) {
			double litters=gallons*3.75;
			System.out.println(gallons+" gallons equals to "+litters+" litters");
		}
		public static void sortdes(int[] array) {
			//array={10,8,99,0,-1}
			Arrays.sort(array);//array={-1,0,8,10,99}
			for(int i=array.length-1;i>=0;i--) {
				System.out.println(array[i]+" ");
			}
			
		
		
	}


}