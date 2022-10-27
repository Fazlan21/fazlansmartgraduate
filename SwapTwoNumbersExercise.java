package smartgraduate;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float first = 2.50f, second = 4.50f;
		
		System.out.print("--Before swap--");
		System.out.print(" First number = " + first);
		System.out.print(" Second number = " + second);
		float temporary = first ;
				
		first = second;
		second = temporary;
			    
		System.out.print("--After swap--");
		System.out.print("First number=" + first);
		System.out.print("Second number=" + second);
		
		 

	}

}
