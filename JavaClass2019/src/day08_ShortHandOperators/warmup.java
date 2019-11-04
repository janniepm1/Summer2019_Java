package day08_ShortHandOperators;

public class warmup {
	public static void main(String[] args) {
		
		
		/* 1 gallo= 3.785 litters
		 * 1 litter= 1/3.785 
		 * 
		 */
		
		int gallon=1;
		double liters =gallon * 3.785; //convert gallon to liters
		String result1= (gallon + "gallons equal to"+ liters + "litters");
		System.out.println(result1);

	double l =1;
	double g= l/3.785;//convert litters to gallons
	System.out.println(l + " litters equal to"+ g+ " gallons");
	//TASK1:
	 int x=2;
	 int y= x++; //y=2; x=3
	       //post
	 System.out.println(y+" " +x);
	 
	 int x2= 2;
	 System.out.println(x2++);//2
	 System.out.println(x2);//3);
			 
	 
	 
			 
	
	
	
	}

}
