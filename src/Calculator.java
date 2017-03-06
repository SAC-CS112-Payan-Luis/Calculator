/* Luis Payan
 * Calculator
 * CS112
 */

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in );

		//Declares int for number1, number2, sum, difference, product, and quotient
				int number1, number2, sum, difference, product, quotient;
				
				//promps user to enter first int
				System.out.print("Enter first integer: "); 
				number1 = input.nextInt();
				
				//promps user to enter second int
				System.out.print("Enter second integer: "); 
				number2 = input.nextInt();
				
				//sums both numbers
				sum = number1 + number2; 
				
				//subtracts both numbers
				difference = number1 - number2; 
				
				//multiplies both numbers
				product = number1 * number2; 
				
				//devides both numbers
				quotient = number1 / number2; 
				
				//Displays result
				System.out.printf("Sum is %d\nDifference is %d\nProduct is %d\nquotient is %d", sum, difference, product, quotient);

	}

} //end calculator

// Good job, Luis.
