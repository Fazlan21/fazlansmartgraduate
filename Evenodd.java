package smartgraduate;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = reader.nextInt();
		
		if(num % 2 == 0)
			System.out.print(num + " is even");
		else
			System.out.print(num + " is odd");
		
		
		
		
		
		
		

	}

}
