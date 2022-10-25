package smartgraduate;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1 = -5.5, n2 = 4.5, n3 = 3.5;
		
		if (n1 >=n2 && n1 >= n3)
			System.out.print(n1 + " is the largest number.");
		
		else if(n2 >= n1 && n2 >= n3)
			System.out.print(n2 + " is the largest number.");
	
		else
			System.out.print(n3 + " is the largest number.");
		
			

	}

}
