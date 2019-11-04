package asiyas_officehours;

public class office_hours2PrimitiveCasting {
	public static void main(String[] args) {
		double d=459.64;
		int e= (int)d;
		//or you can assign
		double d2 =(int)459.64;
		System.out.println(e);
		System.out.println(d2);
		
		
		
		double beforetax=67.85;
		double taxrate=0.09;
		double withtax=beforetax*taxrate;
		System.out.println("before tax the price is "+beforetax+"after tax the price will be "+(withtax+beforetax));
		
		int students=360;
		students=students-5;
		students =students-4;
		System.out.println(students);
	}

}
