
	

	import java.util.Scanner;

	public class Palindrome {
	    public static void main(String[] args) {
	        int number, temp, sum, remainder;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter any number: ");
	        number = sc.nextInt();
	        temp = number;

	        for (sum = 0; number != 0; number/=10) {
	            remainder = number % 10;
	            sum = (sum * 10)+ remainder;
	        }
	        //palindrome if number and sum are equal
	        if (sum == temp) {
	            System.out.println(temp+ " is a palindrome");
	        } else {
	            System.out.println(temp+" is not a palindrome");
	        }
	    }
	}

