package ExamOne;

import java.util.Scanner;

import java.util.Random;

/*Programming Exam: Develop a collection of four different rules for generating the terms of a sequence. 
 * Generate a program for randomly selecting a rule, and a starting point. 
 * Give the user the first four terms of the sequence, and ask them for the fifth. 
 * Tell them if they were correct or not.
 */
public class examOneMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println(
				"This program chooses from four different sequence rules and prints the first four integers of the sequence.\n");
		sleep2000();
		System.out.println("The first four terms are: ");
		sleep500();

//chooses the rule in the switch statement.
		Random rand = new Random();
		int chooseRule = rand.nextInt(4);
		// int chooseRule = 0;
		String rule = " ";

		// System.out.println("Starting Integer: " + startingInt);
		// System.out.println("Rule Chosen: " + chooseRule);

		int nextNumber = 0;

		// the switch that chooses the rule used.
		switch (chooseRule) {

		case 0:
			nextNumber = firstRule();
			rule = "Arithmetic";
			break;

		case 1:
			nextNumber = secondRule();
			rule = "Geometric";
			break;

		case 2:
			nextNumber = thirdRule();
			rule = "Fibonacci";
			break;

		case 3:
			nextNumber = fourthRule();
			rule = "Recurrence";
			break;
		}

		// THIS IS THE INPUT PART. MUST BE UNIVERSAL FOR ALL FOUR CASES.
		sleep1000();

		System.out.println("\nEnter the Next Integer:");
		int userAnswer = input.nextInt();
		//System.out.println(nextNumber);

		if (userAnswer == nextNumber) {
			System.out.println("That is correct. ");
			System.out.println("The " + rule + " rule was used here.");
		} else {
			System.out.println("I would be disappointed if I cared. Wrong Answer.");
		}
		input.close();

	}

	private static void sleep1000() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException ex) {
		}
	}

	private static void sleep500() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException ex) {
		}
	}

	private static void sleep2000() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ex) {
		}
	}

	// the first rule used. Arithmetic
	private static int firstRule() {
		Random rand = new Random();
		int startingInt = rand.nextInt(11);
		int whatToAdd = rand.nextInt(8);
		if (startingInt == 0) {
			startingInt = startingInt + 1;
		}
		if (whatToAdd == 0) {
			whatToAdd = whatToAdd + 1;
		}

		for (int iterations = 1; iterations <= 4; iterations++) {

			System.out.println(startingInt + whatToAdd * iterations);

		}
		return startingInt + whatToAdd * 5;

	}

	// the second rule used. Geometric.

	/*
	 * A geometric progression is a sequence of the form a, ar, ar^2,... , arn,...
	 * where the initial term a and the common ratio r are real numbers
	 */
	private static int secondRule() {
		Random rand = new Random();
		int startingInt = rand.nextInt(11);
		int ratio = rand.nextInt(8);
		if (startingInt == 0) {
			startingInt = startingInt + 1;
		}
		if (ratio == 0) {
			ratio = ratio + 1;
		}

		for (int iterations = 1; iterations <= 4; iterations++) {

			System.out.println(startingInt + Math.pow(ratio, iterations));

		}
		return (int) (startingInt + Math.pow(ratio, 5));

	}

	// add previous two terms. fibonacci
	private static int thirdRule() {
		Random rand = new Random();
		int startingInt = rand.nextInt(11);
		if (startingInt == 0) {
			startingInt = startingInt + 1;
		}

		for (int iterations = 1; iterations <= 4; iterations++) {

			System.out.println(fib(startingInt + iterations));

		}
		return (int) (fib(startingInt + 5));
	}

	private static long fib(int n) {
		if ((n == 0) || (n == 1))
			return n;
		else
			return fib(n - 1) + fib(n - 2);
	}

	private static int fourthRule() {
		/*
		 * Let {an} be a sequence that satisfies the recurrence relation an = an−1 + 3
		 * for n = 1, 2, 3,..., and suppose that a0 = 2. What are a1, a2, and a3?
		 * Solution: We see from the recurrence relation that a1 = a0 + 3 = 2 + 3 = 5.
		 * It then follows that a2 = 5 + 3 = 8 and a3 = 8 + 3 = 11.
		 */

		Random rand = new Random();
//startingInt = a. iteration = n. whatToAdd = "3"
		int startingInt = rand.nextInt(11);
		int whatToAdd = rand.nextInt(8);
		if (startingInt == 0) {
			startingInt = startingInt + 1;
		}
		if (whatToAdd == 0) {
			whatToAdd = whatToAdd + 1;
		}

		for (int iterations = 1; iterations <= 4; iterations++) {

			System.out.println(startingInt * iterations + whatToAdd);

		}
		return startingInt + whatToAdd * 5;
	}

}
