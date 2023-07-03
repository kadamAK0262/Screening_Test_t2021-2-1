package com.problem2;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		ArrayList output = new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter input : ");
		int input=sc.nextInt();
	
		for(int i=0;i<input;i++) {
			
			int data= series(i+1);
			output.add(data);
			data=0;
		}
		
		System.out.println(output);
}

	public static int series(int num) {
		return 1+(num-1)*2;
	}

}
