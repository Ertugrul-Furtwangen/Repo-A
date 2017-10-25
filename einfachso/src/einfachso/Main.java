package einfachso;

public class Main {

	public static void main(String[] args) {
		// TODO Car-generated method stub
		handlePerson();
		handleCar();
		handleCar2();
	}

	public static void handlePerson() {
		Person p = new Person();
		p.printName();
		p.printHair();
		p.printHeight();

		/*
		 * geht auch System.out.println(m.Name);
		 * System.out.println(m.Haarfarbe); System.out.println(m.Groeﬂe);
		 */

	}

	public static void handleCar() {
		Car c = new Car();
		c.setColor("red");
//		c.getColor();
		System.out.println("Farbe des Autos ist: " + c.getColor());

	}
	
	public static void handleCar2(){
		Car2 c2 = new Car2("blue", 90, 10000);
		System.out.println(c2.getColor());
		System.out.println(c2.getKm());
		System.out.println(c2.getKw());
	}

}
