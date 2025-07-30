package OOP;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Lab1 {

	public static void main(String[] args) throws IOException{
		// 1. Data Types
        int N1 = 10;
        float N2 = 5.5f;
        char N3 = 'A';
        boolean N4 = true;
        String N5 = "Niko";

        System.out.println("Data Types:");
        System.out.println("Integer: "+N1);
        System.out.println("Float: "+N2);
        System.out.println("Character: " +N3);
        System.out.println("Boolean: "+N4);
        System.out.println("String: "+N5);
        System.out.println();

        // 2. Operators
        int a = 10, b = 5;
        int sum = a + b;
        int diff = a - b;
        int prod = a * b;
        int div = a / b;

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + prod);
        System.out.println("Division: " + div);
        System.out.println();

        System.out.println("Unary Operators:");
        int x = 10;
        System.out.println("x after increment: "+ ++x);
        System.out.println("x after decrement: "+ --x);
        System.out.println();

        System.out.println("Relational Operators:");
        System.out.println("Is a > b? " + (a > b));
        System.out.println("Is a == b? " + (a == b));
        System.out.println();

        System.out.println("Ternary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max of a and b: " + max);
        System.out.println();

        // 3. if-else
        System.out.println("If-Else Example:");
        if (a % 2 == 0) {
            System.out.println(a + " is Even");
        } else {
            System.out.println(a + " is Odd");
        }
        System.out.println();

        // 4. switch-case with for loop and type conversion
        System.out.println("Switch Case:");
        int choice = 2;
        switch (choice) {
            case 1:
                for (int i = 1; i <= 5; i++) {
                    System.out.println(i);
                }
                break;

            case 2:
                int c = (int)N2;
                System.out.println(c);
                break;

            default:
                System.out.println("Invalid choice");
        }
        System.out.println();

        // 5. while and do-while loops
        System.out.println("While Loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println(i++);
        }
        System.out.println();

        System.out.println("Do-While Loop:");
        int j = 1;
        do {
            System.out.println(j++);
        } while (j <= 3);
        
        //Input Methods
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        int q=Integer.parseInt(br.readLine());
        double w=Double.parseDouble(br.readLine()); 
        char e=(char)br.read();
        br.readLine();
        String r=br.readLine();      
        System.out.println(q+" "+w+" "+e+" "+r);
	}

}
