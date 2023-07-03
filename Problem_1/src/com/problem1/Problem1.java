package com.problem1;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		boolean forRepeat = true;

		while (forRepeat) {
			System.out.print("Enter the first number: ");
			int a = sc.nextInt();
			System.out.print("Enter the second number: ");
			int b = sc.nextInt();
			System.out.println("Which operation you want to perform:(+,-,*,/)");		
			String operation = sc.next();

			int result;
			switch (operation) {
			case "+":
				result = calculator.add(a, b);
				System.out.println("Addition: " + result);
				break;
			case "-":
				result = calculator.subtract(a, b);
				System.out.println("Subtraction: " + result);
				break;
			case "*":
				result = calculator.multiply(a, b);
				System.out.println("Multiplication: " + result);
				break;
			case "/":
				double divisionResult = calculator.divide(a, b);
				System.out.println("Division: " + divisionResult);
				break;
			default:
				System.out.println("Invalid choice!");
				break;
			}

			System.out.print("Do you want to continue? (Yes/No): ");
			String input = sc.next();
			forRepeat = input.equalsIgnoreCase("Yes");
		}
		
	}
}
