package Day40statickeyword;

public class StaticVariables {
	static String name;
	static double staticNum;
	
	int num1;//instance variable belongs to object
	public static void method1() {
		//System.out.println("Open the browser"); local variables only visible within the method
		
	}
	public static void printHello() {
		System.out.println("Hello Cybertek");//anything thats static 
	}
	
	
	public static void main(String[] args) {
	//	System.out.println(num1); static it only accepts class members
		
		StaticVariables objectA=new StaticVariables();
		System.out.println(objectA);
		
		
		
		StaticVariables obj1=new StaticVariables();
		obj1.name="Omar";
		System.out.println(obj1.name);
		
		StaticVariables obj2=new StaticVariables();//each object has its own copy
		obj2.name="Khurshed";//both kurshed will be print it because it can only have one value 
		System.out.println(obj2.name);
		System.out.println(obj1.name);//khurshed on both
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		
	//	System.out.println(StaticVariables.staticNum);//0.0
		
		StaticVariables object1=new StaticVariables();
		object1.staticNum=4.5;
		System.out.println ( object1.staticNum );//4,.5	
		
		StaticVariables object2=new StaticVariables();
		System.out.println(object2.staticNum);//4.5
		
		
		StaticVariables.printHello();
	}
	

}
