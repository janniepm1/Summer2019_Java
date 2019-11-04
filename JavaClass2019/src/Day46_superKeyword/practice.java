package Day46_superKeyword;

class parent{
	int a=0;
	int b=3;
	
	private parent (int a) {
		this("A");
		System.out.println("A");
	}
	public parent (String b) {
	System.out.println("C");
}

}

public class practice extends parent {//default
	
/*
 * public practice(){ 
 * super();
 */
	//public practice() {//you can only call one constructor from the parent class
		//super(10);//you have int so you have to put a number in parenthesis
	//	System.out.println("B");
	//}
	public static void main(String[] args) {
		parent obj=new parent();//
		obj.a=2;
		
		
	}
	
}
