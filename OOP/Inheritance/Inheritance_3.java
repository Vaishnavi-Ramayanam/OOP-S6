package OOP;

class commonBehaviour{
	void eat() {
		System.out.println("Eats food");
	}
}
class dog extends commonBehaviour{
	void bark() {
		System.out.println("Bow Bow");
	}
}
class puppy extends dog{
	void weep() {
		System.out.println("Weep");
	}
}
public class Inheritance_3 {
	public static void main(String[] args) {
		puppy pup=new puppy();
		pup.eat();
		pup.weep();
		dog doggy=new dog();
		doggy.eat();
		doggy.bark();
	}
}
