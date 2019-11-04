package Day41initializerBlocks;

public class instanceBlockPractice {
	
	public String name="Shirin";
	//public instanceBlockPractice(){
	//	name="Dinara";
	//}
	{
		name="Mihray";
	}
	{
		name="Hatice";
	}
	
	
	public static void main(String[] args) {
		instanceBlockPractice obj= new instanceBlockPractice();
		obj.name="Aijamal";
		System.out.println(obj.name);//Shirin
		
		instanceBlockPractice obj2=new instanceBlockPractice();
		System.out.println(obj2.name);
	}
	

}
