package OOP;
class person{
	void info() {
		System.out.println("I am a Person");
	}
}

class Admin extends person{
	void info() {
		System.out.println("I am an Admin");
	}
}

class Student2 extends person{
	void info() {
		System.out.println("I am a Student");
	}
}

class Faculty extends person{
	void info() {
		System.out.println("I am Faculty");
	}
}

public class Practical_4 {
	public static void main(String[] args) {
		Admin p1=new Admin();
		Student2 p2=new Student2();
		Faculty p3=new Faculty();
		person p4=new person();
		
		p4.info();
		p1.info();
		p2.info();
		p3.info();
	}
}
