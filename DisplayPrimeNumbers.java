package smartgraduate;

public class DisplayPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			int i =0;
			int num =0;
			
			String primeNumbers = "";
			
			for (i = 1; 1 <= 100; i++)
			{
				int counter=0;
				for (num =i; num>=1; num--)
				{
					int counter1=0;
					for(num=i; num>=1; num--)
					{
						if(i%num==0)
						{
							counter1 = counter1 + 1;
						}
						
					}
					if (counter1 ==2)
					{
					  primeNumbers = primeNumbers + i + " ";
					}
				}	
					System.out.print(" Prime numbers from 1 to 100 are :");
					System.out.print(primeNumbers);
					
			}
		}	
	}			
}		
				
	



