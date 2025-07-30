package OOP;
import java.util.*;
public class Lab2_10Programs {

	public static void main(String[] args) {
		// Task-1
		byte by = 1;
        short s = 1;
        int i = 1;
        long l = 1L;
        float f = 10.5f;
        double d = 20.12;
        char c = 'A';
        boolean bool = true;

        System.out.println("Size of byte: " + Byte.SIZE );
        System.out.println("Size of short: " + Short.SIZE );
        System.out.println("Size of int: " + Integer.SIZE );
        System.out.println("Size of long: " + Long.SIZE );
        System.out.println("Size of float: " + Float.SIZE );
        System.out.println("Size of double: " + Double.SIZE );
        System.out.println("Size of char: " + Character.SIZE );
        System.out.println("Size of boolean: JVM dependent");
        
		// Task-2
        String name;int roll,age,percentage;char gender;
        Scanner ob=new Scanner(System.in);
        
        System.out.println("Enter the required deatils:");
        name=ob.nextLine();
        roll=ob.nextInt();
        age=ob.nextInt();
        gender=ob.next().charAt(0);
        percentage=ob.nextInt();
        
        System.out.println("Details of the Student are:\n"+name+"\n"+roll+"\n"+age+"\n"+gender+"\n"+percentage);
		
        // Task-3
        int numInt = 123456789;
        long numLong = numInt;
        float numFloat = numLong;

        System.out.println("Original int value: " + numInt);
        System.out.println("Converted to long: " + numLong);
        System.out.println("Converted to float: " + numFloat);
        
		// Task-4
        System.out.print("Enter a double value: ");
        double doubleValue = ob.nextDouble();

        System.out.println("Original double value: " + doubleValue);
        System.out.println("Converted int value: " + (int)doubleValue);
        
		// Task-5
        System.out.print("Enter a character: ");
        char ch = ob.next().charAt(0);
        int asciiValue = (int) ch;

        System.out.println("Character entered: " + ch);
        System.out.println("ASCII value: " + asciiValue);
        System.out.println("Converted to integer: " + asciiValue);
        
		// Task-6
        int exp1 = 10 + 2 * 5;
        int exp2 = (10 + 2) * 5;
        int exp3 = 100 / 5 + 2 * 3 - 4;

        System.out.println(exp1);
        System.out.println(exp2);
        System.out.println(exp3);
        
		// Task-7
        int num1,num2,num3;
        System.out.println("Enter 3 values:");
        num1=ob.nextInt();
        num2=ob.nextInt();
        num3=ob.nextInt();
        
        System.out.println("Average: "+(num1+num2+num3)/3);
        
		// Task-8
        System.out.print("Enter numbers:");
        int a = ob.nextInt();
        int b = ob.nextInt();

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));

        if (b != 0) {
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Division and modulo by zero are not allowed.");
        }
        
		// Task-9
        System.out.println("Bitwise Operations on a = " + a + " and b = " + b);
        System.out.println("Binary of a: " + Integer.toBinaryString(a));
        System.out.println("Binary of b: " + Integer.toBinaryString(b));

        int and = a & b;
        int or = a | b;
        int xor = a ^ b;
        int leftShift = a << 1;
        int rightShift = a >> 1;

        System.out.println("\na & b = " + and + " (Binary: " + Integer.toBinaryString(and) + ")");
        System.out.println("a | b = " + or + " (Binary: " + Integer.toBinaryString(or) + ")");
        System.out.println("a ^ b = " + xor + " (Binary: " + Integer.toBinaryString(xor) + ")");
        System.out.println("a << 1 = " + leftShift + " (Binary: " + Integer.toBinaryString(leftShift) + ")");
        System.out.println("a >> 1 = " + rightShift + " (Binary: " + Integer.toBinaryString(rightShift) + ")");
        
		// Task-10
        System.out.print("Enter a number: ");
        int num = ob.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " is divisible by both 3 and 5.");
        } else {
            System.out.println(num + " is NOT divisible by both 3 and 5.");
        }
        
		// Task-11
		// Task-12

	}

}
