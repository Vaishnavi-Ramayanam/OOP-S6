package OOP;
import java.util.*;
class Student{
	String name;
	int roll;
	int marks[];
	void setter(String name,int roll,int marks[]) {
		this.name=name;
		this.roll=roll;
		this.marks=marks;
	}
	void getter() {
		System.out.println("Name of the Student: " + name);
		System.out.println("Rollno of the Student: " + roll);
		System.out.println("Marks of the Student:  " );
		  for (int marks : marks) {
		        System.out.print(marks + " ");
		    }
		  }
}
	
public class Practical_1 {
	
	public static void main(String[] args) {
		Student a=new Student();
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter Name, Roll No. and Number of Subjects:");
		String name=ob.next();
		int roll=ob.nextInt();
		int n=ob.nextInt();
		int[] marks = new int[n];
		System.out.println("\nEnter Subject Marks:");
		for(int i=0;i<n;i++) {
			marks[i]=ob.nextInt();
		}
		a.setter(name,roll,marks);
		a.getter();
		ob.close();
	}

}
