import java.util.Scanner;

public class SumOfNaturalNumbers {

	 public static void main(String[] args) {
	        System.out.println("Enter the number:");
	        //Creating Scanner class for taking input from the user
	        Scanner sc = new Scanner(System.in);
	        int number = sc.nextInt();
	        int sum = 0;

	        //for loop will execute the condition until it returns true value
	        for (int i = 1; i <= number; i++) {
	            //adding the value of i into sum variable
	            sum = sum + i;
	    }
	        //prints sum
	        System.out.println("Sum of n Natural Numbers: " +sum);
	    }
	}

