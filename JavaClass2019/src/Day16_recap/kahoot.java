package Day16_recap;

public class kahoot {
public static void main(String[] args) {
	int batch=12;
	switch (batch) {
	case 14:// cannot start from 0 
		System.out.println("Cybertek");
		break;
	case 12: 
		System.out.println("best");
		
		default:
			System.out.println("batch");
	}
	// 
	int x=5, y=19;
	int num=(y-x> x-y? y-x: x-y);
	// 14> -14 ? 14: -14
	System.out.println(num);
	
	
	
	int sum =2, price=100;
	sum*= price>=100 ?price*=2 :price;//price becomes 200
	//100>100? price=price*2 :100
	// true  sum *=200; ==>400
	
	System.out.println(sum+" " +price);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
