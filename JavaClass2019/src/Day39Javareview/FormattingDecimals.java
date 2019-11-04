package Day39Javareview;

import java.text.DecimalFormat;

public class FormattingDecimals {
	public static void main(String[] args) {
		DecimalFormat format=new DecimalFormat("0.00");
		double b=23.13129873;
		//format(double); formats the decimals and returns string value
		
		String num1=format.format(b);
		System.out.println(num1);
		
		double c=45.56789;//45.57
		System.out.println(format.format(c));
		
		c=Double.parseDouble(format.format(c));//primitive to primitive none
		//
		System.out.println(c+1);
		
		
	}

}
