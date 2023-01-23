package com.bridgelabz.secondpack;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String args[]) {
		int Number, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive integer number");
		Number = sc.nextInt();
		int i = 1;
		while (i <= Number / 2) {
			if (Number % i == 0) {
				sum = sum + i;
			}
			i++;
		}
		if (Number == sum) {
			System.out.println(Number + " is a perfect number");
		} else
			System.out.println(Number + " is not a perfect number");
	}
}