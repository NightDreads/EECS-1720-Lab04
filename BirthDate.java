import java.io.PrintStream;
import java.util.Scanner;


// BirthDate APP (test1a - Question 1)

/**
* This app prompts the user for a month (mm) and year (yyyy) to be entered as text
* and prints some text/values to the console.
* 
* *** Requested User Input ***
* 
* (1) two dash-delimited tokens (e.g., mm-yyyy). Let the tokens be denoted mm and
* yyyy, respectively. The dash '-' may be prefixed or suffixed with an arbitrary
* number of space characters.
* 
* (2) both mm and yyyy must be parsed as integers
* 
* 
* *** App Behaviour: ***
* 
* If the user's input conforms to the requested format, then the app will output both
* the month and the year as the following string: "Month: mm, Year: yyyy" where 
* mm and yyyy are the values of these variables (printed as ints):
* 
* Examples:		user types: "03:2010"   output: "Month: 3, Year: 2010"
* 				user types: "1:1950"	output:	"Month: 1, Year: 1950"
* 				user types: "10:1982"   output: "Month: 10, Year: 1982"
*
* 
* If the user's input does not contain a dash-delimiter, then the app does a
* clean exit, with the message "Missing Dash (-)".
* 
* If the user's input does contain a dash-delimiter, but the tokens cannot
* both be parsed as ints, then the app does a clean exit, with the message
* "Invalid Numeric Data!".
* 
* If the token mm is not a valid month (i.e. has a value 1-12 ), then the app
* should generate and catch an ArithmeticException that displays the message: 
* "Month Range Invalid!", before doing a clean exit.
* 
* If the token yyyy is a year before 1900 or after 2019, then the app
* should generate and catch an ArithmeticException that displays the message: 
* "Year Range Invalid!", before doing a clean exit.
* 
**/


public class BirthDate {

	public static void main(String[] args) {
		
		
		
		PrintStream out = System.out;
		Scanner in = new Scanner(System.in);
		final String PROMPT = "Enter \"mm-yyyy\" (where c is a char and s is a String): ";
		out.println(PROMPT);

		
		/*
		 * [1 mark] Task 1: Read the user's input and store it in a string
		 * variable.
		 * 
		 * Put your code in the appropriate block
		 * 
		 */
		
		// ==== SOLUTION TO TASK 1 HERE ======================
		
		

		
		
		
		
		
		// ==== END OF SOLUTION TO TASK 1 ====================
	
		
		
		/*
		 * [5 marks] Task 2: Read the comment block above.
		 * 
		 * Now identify and make use of a service that can be used to extract
		 * the two dash-delimited tokens from the user's input, and to store
		 * each of two tokens in its own String variable. Read the contract
		 * carefully to understand what app behaviour is and is not needed.
		 * 
		 * Print each token to the console.
		 * 
		 * Put your code in the appropriate block
		 */
		
		// ==== SOLUTION TO TASK 2 HERE ======================
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// ==== END OF SOLUTION TO TASK 2 ====================
		
	
		
		/*
		 * [4 marks] Task 3: Now identify and make use of a service that can be
		 * used to parse each token as an integer. Declare the variables and
		 * assign the variables. Read the contract carefully to understand what
		 * app behaviour is and is not needed.  
		 * 
		 * Handle the final two ArithmeticException conditions as required by the app 
		 * behaviour description at the top of this file.
		 * 
		 * Put your code in the appropriate block
		 */
		
		// ==== SOLUTION TO TASK 3 HERE ======================
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		

		// ==== END OF SOLUTION TO TASK 3 ====================
		

	
		
		/*
		 * [5 marks] Task 4: Create code that will generate and handle the final two
		 * ArithmeticException conditions listed in the app behaviour description.
		 * These should ensure that the range of values entered for month and year are
		 * as expected.  Make sure the correct messages are generated for each condition
		 * and the app does a clean exit for each.
		 * 
		 * Finally, output the month and year in the string format described
		 * in the app behaviour description
		 * 
		 */

		// ==== SOLUTION TO TASK 4 HERE ======================
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// ==== END OF SOLUTION TO TASK 4 ====================
		

	

		
		in.close();
		
		
		
	}

}
