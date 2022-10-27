package smartgraduate;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int temp;
			boolean isPrime=true;
			Scanner scan= new Scanner(System.in);
			System.out.print("Enter any number:");
			
			int num=scan.nextInt();
			 scan.close();
			for(int i=2;i<=num/2;i++)
			{
				 temp=num%1;
				if(temp==0) 
				{
					isPrime=false;
					break;
				}
			}
			
			if(isPrime)
				System.out.print(num + "is a prime Number");
			else
				System.out.print(num + "is not a prime Number");
			}
	}	
}				
			
				
			
		

	
