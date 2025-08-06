package OOP;

class Appliance {
 void turnOn() {
     System.out.println("Appliance is turned ON");
 }

 void turnOff() {
     System.out.println("Appliance is turned OFF");
 }
}

class Fan extends Appliance {
 void rotate() {
     System.out.println("Fan is rotating");
 }
}

class CeilingFan extends Fan {
 void setSpeed(int speed) {
     System.out.println("Ceiling Fan speed set to: " + speed);
 }
}

public class Inheritance_5 {
 public static void main(String[] args) {
     CeilingFan myFan = new CeilingFan();

     myFan.turnOn();     
     myFan.rotate();       
     myFan.setSpeed(3);    
     myFan.turnOff();      
 }
}
