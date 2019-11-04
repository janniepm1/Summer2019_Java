package Day39Javareview;



public class Constructors {
	
	public Constructors() {
		System.out.print("Erhan ");
	}
	public Constructors(int a) {//erhan ali
		this();//Erhan
		System.out.print("Ali ");//ali
	}
	public Constructors(double a) {//erhan ali Shawkrat
		this(100);//constructor must be the first step
		System.out.println("Shawrat ");
	}
	public Constructors(boolean a) {//erhan ali shawkrat dinara
		this(2.5);//erhan ali shawrat
		System.out.println("Dinara");
	}
	public Constructors(String str) {
		this(100);
		System.out.println("Seyfo"
				);
	}
	public static void main(String[] args) {
		
		Constructors obj=new Constructors(9>10);
		
		
	}

}
