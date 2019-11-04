package Day41initializerBlocks;

public class InstanceBlock {
	{
		System.out.println("Instance Block 1");
	}
	
	{
		System.out.println("Instance Block 2");
	}
	{
		System.out.println("Instance Block 3");
	}
	public InstanceBlock() {
		System.out.println("Constructor");
	}
	//constuctor is last
	public static void main(String[] args) {
		InstanceBlock obj=new InstanceBlock();//instance and constructor
		InstanceBlock obj2=new InstanceBlock();
	//	InstanceBlock obj3=new InstanceBlock();
		
		
	}

}
