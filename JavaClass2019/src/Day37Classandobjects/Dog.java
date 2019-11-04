package Day37Classandobjects;

public class Dog {

	/*
	 * dog class 
	 * 	attributes/data:
	 * 			BREED SIZE AGE COLOR NAME GENDER 
	 * ACTIONS:
	 * 			EATR,SLEEP,BARK,PLAY
	 */
	
	String Breed;
	String Size;
	byte Age;
	String Color;
	String Name;
	char Gender;
	String Food;
	
	public void getInfo() {
		System.out.println(Breed+" "+Size+" , "+Age+" ,"+Color+" ,"+"Name is "+Name+ " ,"+ Gender);
	}
	public void eat() {
		System.out.println(Name+ " is eating "+ Food);
	}
	public void play() {
		System.out.println(Breed+ " is playing");
	}

	
	
}
