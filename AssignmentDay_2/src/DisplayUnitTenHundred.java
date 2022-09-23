import java.util.Scanner;

public class DisplayUnitTenHundred {
	
	 public static void main(String[] args) {
	        //Values taken for each digit
	        int number, unit, tens, hundreds, thousands;

	        //Creating new Scanner class
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the 4 digit Number:");
	        number = sc.nextInt();

	        unit = number % 10;
	        System.out.println("The number is in unit place: " + unit);
	        tens = number % 100 / 10;
	        System.out.println("The number is in tens place: " + tens);
	        hundreds = number % 1000 / 100;
	        System.out.println("The number is in hundreds place: " + hundreds);
	        thousands = number % 10000 / 1000;
	        System.out.println("The number is in thousands place:" + thousands);

	        if (number > 9999){
	            System.out.println("Error! Number more then 4 digits.");
	        }
	        else {
	            System.out.println("Exit.");
	        }
	    }

}
