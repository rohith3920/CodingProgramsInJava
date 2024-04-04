package areaofTriangle;
import java.lang.*;
import java.util.*;



public class Triangle {

	public static void main(String[] args) {
			int a,b,c;
			float s;
			double area;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the 3 sides of the value");
			
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			
			
			s = (a+b+c)/2f;
			
			area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
			
System.out.println("Area of " + area);
			

	}

}
