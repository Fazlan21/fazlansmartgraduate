package smartgraduate;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, number = 1, counter, j;
		 Scanner input =new Scanner(System.in);
		 System.out.print("Enter the number of rows for floyd's triangle:");
		 
		 rows = input.nextInt();
		 System.out.print("Floyd's triangle");
		 System.out.print("****************");
		 for( counter = 1 ; counter<=rows ; counter++)
		 {
			 for (j = 1 ; j <= counter ; j++)
			 {
				  System.out.print(number+" ");
				  
				  number++;
			} 
            
			System.out.println();
		 
		 }
	}
}
			 
		 
	 
				  


				
		 
		 
		


