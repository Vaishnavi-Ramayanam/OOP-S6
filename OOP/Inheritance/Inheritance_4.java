package OOP;
class Person {
    void displayInfo(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class student extends Person {
    void id(int id) {
        System.out.println("Student ID: " + id);
    }
}

class GraduateStudent extends student {
    void submitThesis(int flag) {
        if (flag == 0)
            System.out.println("Thesis: Not Submitted");
        else
            System.out.println("Thesis: Submitted");
    }
}

public class Inheritance_4 {
    public static void main(String[] args) {
        GraduateStudent grad = new GraduateStudent();

        grad.displayInfo("Vaishnavi", 22); 
        grad.id(202501);                   
        grad.submitThesis(1);         
    }
}

