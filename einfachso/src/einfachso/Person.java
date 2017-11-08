package einfachso;

public class Person {

	String name;
	String hair;
	int height;
	int a1;
	
	Person(){
		this.name="Erti";
		this.hair="black";
		this.height=172;
	}
	
	public void printName(){
		
		System.out.println("Mein Name ist: " + name);		
	}

	public void printHair(){
		System.out.println("Meine Haarfarbe ist: " + hair);
	}
	
	public void printHeight(){
		System.out.println("Meine Körpergroesse ist: " + height + " cm");
	}
}
