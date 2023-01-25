package com.bridgelabz.secondpack;

import java.util.Scanner;
import java.util.Random;

public class SnakeAndLadderGame {
	public static void main(String[] args) {
		int x, position = 0, diceCount = 0;
		Random rand = new Random();
		{
			while (position < 100) {
				System.out.println("Dice is rolled and it is ");
				int randomNum = rand.nextInt(6) + 1;// 1-6
				System.out.println(randomNum);
				diceCount++;
				position = randomNum + position;
				if (position == 7) {
					position = position + randomNum;// ladder from position 7
					System.out.println("wow it is a ladder " + "\n");
					System.out.println("new position is " + position);
				} else if (position == 68) {
					position = position + randomNum; // ladder from position 68
					System.out.println("wow it is a ladder....! " + "\n");
					System.out.println("new position is " + position);
				} else if (position == 99) {
					position = position - randomNum; // snake from position 99
					System.err.println("oh it is a snake...! " + "\n");
					System.out.println("new position is " + position);
				} else if (position == 54) {
					position = position - randomNum; // snake from position 54
					System.err.println("oh it is a snake...! " + "\n");
					System.out.println("new position is " + position);
				} else {
					System.out.println("new position is " + position);
				}
				x = position;
				if (position == 100) {
					System.err.println("Congrats you win...!");
					System.out.println(diceCount + " times the Dice is Rolled...!");
					System.exit(0);
				} else
					System.out.println('\n' + "Press 1 to continue");
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				if (num == 1) {
					System.out.println("Dice is rolling");
					System.err.println(".\n" + ".\n");
				} else {
					System.err.println("wrong keyword try again...!");
					System.err.println(".\n" + ".\n");
					System.exit(0);
				}
				// while (position>100)
				// position=x;
				// continue;
			}
			System.err.println("Congrats you win...!");
			System.out.println(diceCount + " times the Dice is Rolled...!");
		}
	}
}