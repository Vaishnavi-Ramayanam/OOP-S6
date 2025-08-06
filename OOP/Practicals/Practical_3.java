package OOP;

import java.util.Arrays;

public class Practical_3 {

	public static void main(String[] args) {
		// interning
		String a = "hello";                
		String b = new String("hello");   
		String c = b.intern();            

		System.out.println(a == b);        
		System.out.println(a == c);        
		System.out.println(a.equals(b));   

		//immutability
		String x="hi";
		x.concat("name");
		System.out.println(x);
		x=x+"name";
		System.out.println(x);
		
		//equals vs ==
		System.out.println(b == c);              
		System.out.println(c.equals(b));   
		
		//manipulation of arrays of strings
		String arr[]= {"a","b","c"};
		System.out.println(arr[0]);
		arr[0]="d";
		System.out.println(arr[0]);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
		System.out.println();
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
	}

}
