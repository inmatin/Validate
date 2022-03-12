/*
 * Author: Stanley Pieda
 * Date: Nov 8, 2020
 * Description: Demonstration of validating user input.
 */

/*
 * This class runs a demonstration of validating user input.
 */
public class RunDemo {

	/*
	 * Entry point for the application
	 */
	public static void main(String[] args) {
		String shouldContinue = "Y";
		UserInput userInput = new UserInput();
		final int MAX_VALUE = 10;
		
		while(shouldContinue.equalsIgnoreCase("Y")) {
			
			System.out.println("Enter input value 1");
			int input1 = userInput.inputInteger(MAX_VALUE);
			
			System.out.println("Enter input value 2");
			int input2 = userInput.inputIntegerAlternative(MAX_VALUE);
			
			System.out.println("input1 " + input1);
			System.out.println("input2 " + input2);
			
			System.out.print("Enter Y to enter more numbers: ");
			shouldContinue = userInput.inputString();
			System.out.println();
			
		} // endwhile
		
		System.out.println("Thanks for using the program");
		
	} // end main
	
} // end class
