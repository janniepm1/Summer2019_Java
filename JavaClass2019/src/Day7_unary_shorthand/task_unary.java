package Day7_unary_shorthand;

public class task_unary {
 public static void main(String[] args) {
	
	 
	 int a=1;
	 a= -a-- + a++/ -a-- * --a;
	 // post   post post   pre
	 //  -1  +0  /-1  * -1
	 //    -1+ 0* -1
	 //-1
	 System.out.println(a);
	 
	 
	 
	 int b=50;
	 b= --b + b++ +b-- + b++;
	 // pre   post  post  post
	 //49 + 49 +50 +49
	 System.out.println(b);
	 
	 
	     
}
}
