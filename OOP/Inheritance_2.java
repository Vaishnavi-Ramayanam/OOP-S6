package OOP;
class commonVehicle{
	void move() {
		System.out.println("Moved forward");
	}
}
class car extends commonVehicle{
	void fuelType(String type) {
		System.out.println("Car takes "+type);
	}
}
public class Inheritance_2 {
	public static void main(String[] args) {
		car mycar=new car();
		mycar.move();
		mycar.fuelType("Petrol");
	}
}
