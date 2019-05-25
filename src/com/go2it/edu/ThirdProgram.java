package com.go2it.edu;

import java.util.Scanner;

/**
 * @author Alex Ryzhkov
 */
public class ThirdProgram {

	public static void main(String[] args) {

		try (Scanner in = new Scanner(System.in)) {
			int secureNumberToGuess = (int) (Math.random() * 10);
			System.out.println(
					"Let's play 'Guess number'. I guessed the number from 0 to 9 and you can try to guess it");
			int numberOfTries = 0;

			System.out.println("Try to guess the number now!");
			while (true) {
				try {
					String inputIntRaw = in.next();

					int inputInt = Integer.valueOf(inputIntRaw);
					if (inputInt == secureNumberToGuess) {
						System.out.println("Congratulation! You won! It took for you " + numberOfTries
								+ " times to guess the number");
						break;
					} else {
						System.out.println("You entered " + inputInt
								+ ", but I guessed another number. Try again please");
						numberOfTries++;
					}
				} catch (NumberFormatException e) {
					System.out.println("Oops! Only digits are allowed here. Please try again");
				}
			}
		}
	}
}
