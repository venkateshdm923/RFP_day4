package com.bridgelabz.secondpack;

import java.util.Random;

public class PartTime_1 {
	// class/

	public static void main(String[] args) {
		byte WagePerHour = 20;
		byte FullDayHour = 8;
		byte PartTimeHour = 8;
		int DailyWage = 0;
		int PartTimeWage = 0;
		Random rand = new Random(); // object creation
		int randomNum = rand.nextInt(3);
		System.out.println(randomNum);
		if (randomNum == 0) {
			System.out.println("Employee is absent");
			System.out.println("No wage is earned for the day");
		} else if (randomNum == 1) {
			System.out.println("Employee is present");
			DailyWage = (WagePerHour * FullDayHour);
			System.out.println("Employee is present and earned " + DailyWage + "rupees");
		} else {
			System.out.println("Employee is partTime");
			PartTimeWage = (WagePerHour * PartTimeHour);
			System.out.println("Employee is parttime and he erned " + PartTimeWage + "rupees");
		}
	}
}