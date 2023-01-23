package com.bridgelabz.secondpack;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String args[]) {
		int Number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive whole number greater than 1");
		Number = sc.nextInt();
		int i, a = 0;
		if (Number == 2) {
			System.out.println(Number + " is a prime number");
		} else {

			for (i = 2; i < Number; i++) {
				if (Number % i == 1)
					a = 1;
				i++;
			}
			if (a == 1) {
				System.out.println(Number + " is a prime number");
			} else {
				System.out.println(Number + " is not a prime number");

			}

		}
	}
}
