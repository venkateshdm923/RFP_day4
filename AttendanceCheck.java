package com.bridgelabz.secondpack;

import java.util.Random;

public class AttendanceCheck {
	// class
	public static void main(String[] args) {
		Random rand = new Random(); // object creation
		int randomNum = rand.nextInt(2);
		System.out.println(randomNum);
		if (randomNum == 0) {
			System.out.println("Employee is absent");
		} else {
			System.out.println("Employee is present");
		}
	}
}