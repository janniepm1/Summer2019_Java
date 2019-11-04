package Day36arraylistloopsconstruc;

public class ConstructorCalls3 {
	 private String code;
	String description; 
	double price;
	
	
	public ConstructorCalls3() {
		this("safwan","Cinthya",0.0);
			System.out.println("i am default");
			
		}
	public ConstructorCalls3(String aa,String bb, double cc) {
		this.setCode(aa);
		this.description=bb;
		this.price=cc;
	}
	public ConstructorCalls3(String c,String d, int p) {
		setCode(c);
		description=d;
		price=p;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
