package smartgraduate;

import java.util.Scanner;

public class FindAreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the width of the Triangle:");
		double base = scanner.nextDouble();
		
		System.out.print("Enter the hight of the triangle:");
		double height = scanner.nextDouble();
		
		double area = (base* height)/2;
		System.out.print("Area of triangle is:" + area );
	}
}	
 
		
		
		
		
		

	

