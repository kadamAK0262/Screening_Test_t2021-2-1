package com.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input : ");
		int input = sc.nextInt();
		List<Integer> output = generateSeries(input);
		System.out.println("Output: " + output);
	}

	public static List<Integer> generateSeries(int input) {
		List<Integer> output = new ArrayList<>();
		if (input % 2 == 0) {
			input = input - 1;
		}
		for (int i = 1; i <= input; i++) {
			int data = 1 + (i - 1) * 2;
			if ((data % 2 != 0)) {
				output.add(data);
			}
		}

		return output;
	}

}
