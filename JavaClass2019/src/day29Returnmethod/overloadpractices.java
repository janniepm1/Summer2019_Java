package day29Returnmethod;

public class overloadpractices {
	public static void main(String[] kfc) {
		System.out.println("String Array");
		boolean[] array2= {true,false};
		main(array2);
		
		double[] array1= {1,2,3};
		main(array1);
		return;
		//after return nothing else can be executed
		
	}
	public static void main(int[] args) {
		System.out.println("Int Array");
	}
public static void main (double[] args) {
	System.out.println("double Array");
}
public static void main (boolean[] args) {
	System.out.println("Boolean array");
}
}
