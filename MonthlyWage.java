package com.bridgelabz.secondpack;

import java.util.Random;

public class MonthlyWage {
	public static void main(String[] args) {
		byte WagePerHour = 20;
		byte FullDayHour = 8;
		byte PartTimeHour = 8;
		short DailyWage;
		short PartTimeWage;
		short MonthlyWage;
		byte PartTimeCount = 0;
		byte AbsentCount = 0;
		byte PresentCount = 0;
		byte WorkingDays = 20;
		for (int i = 1; i <= WorkingDays; i++) {
			Random rand = new Random();

			int randomNum = rand.nextInt(3);

			if (randomNum == 0) {
				AbsentCount++;

			} else if (randomNum == 1) {
				PartTimeCount++;

			} else
				PresentCount++;

		}
		System.out.println(" Employee absent for " + AbsentCount + " days" + " \n " + "Employee Parttime for "
				+ PartTimeCount + " days" + " \n " + "Employee Present for " + PresentCount + " days" + "\n");
		DailyWage = (short) (WagePerHour * FullDayHour * PresentCount);
		System.out.println("Total daily wage earned in the month is " + DailyWage + " rupees");
		PartTimeWage = (short) (WagePerHour * PartTimeHour * PartTimeCount);
		System.out.println("Total PartTime wage earned in the month is " + PartTimeWage + " rupees");
		MonthlyWage = (short) (DailyWage + PartTimeWage);
		System.out.println("Total wage earned in the month is " + MonthlyWage + " rupees" + "\n");

	}
}