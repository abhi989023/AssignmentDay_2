import java.util.Scanner;

public class ReverseNumberUsingForLoop {

	public static void main(String[] args) {
        System.out.println("Enter the number:");
        //Creating Scanner class for taking input from the user
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int reverse = 0;

        //it will run the loop until number becomes 0
        for (int i = 0; number != 0; number = number/10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " +reverse);
    }
}

