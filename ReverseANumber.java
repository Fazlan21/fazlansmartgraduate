package smartgraduate;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int num=0;
			int resversenum =0;
			System.out.print("Input your number and press enter: ");
			 
		    Scanner in = new Scanner(System.in);
		    
		    num = in.nextInt();
		    
		    int reversenum = 0;
			while( num != 0)
		    {
		    	reversenum = reversenum * 10;
		    	reversenum = reversenum + num%10;
		    	num = num/10;
		    }
		    System.out.print("Reverse of input number is: "+ reversenum);
		}
	}		
}		

	

