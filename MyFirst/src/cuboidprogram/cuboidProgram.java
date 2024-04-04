package cuboidprogram;
import java.lang.*;
import java.util.*;



public class cuboidProgram {

	public static void main(String[] args) {
		
		int length,breadth,height;
		int totalArea,volume;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the length, breadth and height ");
		
		length = sc.nextInt();
		breadth = sc.nextInt();
		height  = sc.nextInt();
		
		totalArea = 2*(length * breadth + length * height + breadth * height);
		volume = length * breadth * height;
		
		System.out.println("total Area " + totalArea);
		System.out.println("Volume " + volume);
		

	}

}
