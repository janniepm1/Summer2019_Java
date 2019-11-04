package Day37Classandobjects;

public class DogObjects {
	public static void main(String[] args) {
		
	
	Dog dog1=new Dog();
	//attributes
	dog1.Breed="Husky";
	dog1.Size="Small";
	dog1.Color="Gray and White";
	dog1.Name="Holly";
	dog1.Gender='F';
	dog1.Age=25;
	dog1.Food="Sushi";
	
	dog1.getInfo();
	dog1.eat();
	dog1.play();
	/*\
	 * Assignment:
	 * create a custom class for employess
	 * 		atributes: Employeename,employeeid,jobtitle,ssn,gender,salary
	 * actions: get info ,2 or 3 more actions
	 * 
	 */
	
	}
}