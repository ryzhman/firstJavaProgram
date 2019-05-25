package com.go2it.edu;

import java.util.Scanner;

/**
 * @author Alex Ryzhkov
 */
public class SecondProgram {

	public static void main(String[] args) {

		System.out.println("Hello user! Welcome to my program. Please enter something: ");
		Scanner in = new Scanner(System.in);
		String inputFromUser = in.nextLine();
		System.out.println("You entered: " + inputFromUser);

	}
}
