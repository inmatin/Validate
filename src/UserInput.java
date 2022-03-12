/*
 * Author: Stanley Pieda
 * Date: Nov 8, 2020
 * Description: Program to demonstrate validation of user input, it verifies
 *              that the input is numerical and integer, then below a max
 *              value. Note that min-value is not checked, the program would
 *              need to be extended.
 */
import java.util.Scanner;

/*
 * This class contains a demonstration of validating user input.
 */
public class UserInput {
	
	private Scanner keyboard = new Scanner(System.in);

	/*
	 * Use of while loop with sentinel value to validate user input
	 * Verbose, easier to trace.
	 */
	public int inputInteger(int maxValue) {
		int number = 0;
		boolean isInputBad = true; // sentinel loop control variable
		while(isInputBad) { // same as (isInputBad == true)
			System.out.printf("Please enter an integer, max value %d%n", maxValue);
			if(keyboard.hasNextInt()) {
				number = keyboard.nextInt(); // safe to read number
				if(number <= maxValue) {
					isInputBad = false; // alter sentinel value
				}
			}
			keyboard.nextLine(); // clear stream for next loop
		} // end while
		return number; // exit the method
	} // end inputInteger
	
	
	/*
	 *  use of short-circuit operator with loop for validation
	 *  this is possibly harder to understand, although shorter.
	 *  If the keyboard.hasNextInt() is false, the && short-circuits and
	 *  the rest of the line (which would crash the program, is skipped)
	 */
	public int inputIntegerAlternative(int maxValue) {
		int number = 0;
		while(!(keyboard.hasNextInt() && (number = keyboard.nextInt()) <= maxValue)) {
			System.out.printf("Please enter an integer, max value %d%n", maxValue);
			keyboard.nextLine(); // clear stream for next loop
		} // end while
		keyboard.nextLine(); // clear stream for external code before return.
		return number; // exit the method
	} // end method
	
	/*
	 * Returns a String from the console (no validation).
	 * Could implement something like a bad-word filter if had time.
	 */
	public String inputString() {
		return keyboard.nextLine();
	}

} // end class
