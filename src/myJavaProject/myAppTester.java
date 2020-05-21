/**
 * 
 */
package myJavaProject;

import java.util.*;

/**
 * @author 12363
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Software Engineering World ");
		
	
		
		
		  Scanner sc = new Scanner(System.in);
		  
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	 
	        int sumOfDigits = findSumOfDigits(number);
	        System.out.println("Sum of digits of " + number + " is " + sumOfDigits);
	 
	        
	    }

	 
	    // Find sum of digits of a number
	    public static int findSumOfDigits(int number) {
	        int sum = 0;
	        while (number > 0) {
	            int digit = number % 10;
	            number = number / 10;
	            sum += digit;
	        }
	        return sum;
	    }

	}


