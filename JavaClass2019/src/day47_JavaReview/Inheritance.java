package day47_JavaReview;


	class A{
		public String name="Ayaz";
		
		
	}
	class B extends A{
		//public String name="Ayaz";
		public String name2="Sukhran";
		public String name3="Erhan";
		
	}
	
	public class Inheritance extends B{
		public String name4="Mehmet";
		public String name5="Cinthya";
		//public String name="Ayaz";
			//	public String name2="Sukhran";
			//	public String name3="Erhan";
				
public static void main(String[] args) {
	Inheritance obj=new Inheritance();
	System.out.println(obj.name);
	
}
}