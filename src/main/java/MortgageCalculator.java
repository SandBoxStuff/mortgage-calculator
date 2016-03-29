import java.util.*;

public class MortgageCalculator {

	static String input;
	static float interest;
	static int principle;
	static String propertyId;
	static Scanner scanner = new Scanner(System.in);
	static int termInMonths;
	static String userName;

	public static void anotherUser() {
		System.out.println("Would you like to calculate data for another property? Yes or Not");
		input = scanner.nextLine();
	}

	public static void calculateMonthlyPayment() {
		double monthlyPayment = (principle * interest) / (1 - Math.pow(1 + interest, -termInMonths));
		System.out.println("Your monthly payment is :" + monthlyPayment);

	}

	public static void main(String[] args) {

		do {
			welcome();
			propertyId();
			questions();
			calculateMonthlyPayment();
			anotherUser();
		} while (input.equalsIgnoreCase("yes"));
	}

	public static void propertyId() {
		System.out.println("What is your property ID?");
		propertyId = scanner.nextLine();
		System.out.println("Thanks, " + userName + ". Just to confirm, your property ID is " + propertyId);

	}

	public static void questions() {
		System.out.println("What is the principle? (ex: 200000)");
		principle = Integer.parseInt(scanner.nextLine());
		System.out.println("What is the interest? (ex: .0575)");
		interest = Float.parseFloat(scanner.nextLine());
		System.out.println("What is your term in months? (ex: 360)");
		termInMonths = Integer.parseInt(scanner.nextLine());
		System.out.println("Thanks, your principle is " + principle + ". Your interest is " + interest
				+ ". Your term is month is " + termInMonths);

	}

	public static void welcome() {
		System.out.println("Please, enter your name?");
		userName = scanner.nextLine();
		System.out.println("Hello, " + userName + ". Welcome!");
	}

	double monthlyPayment;
}
