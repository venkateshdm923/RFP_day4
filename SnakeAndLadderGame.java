package com.bridgelabz.secondpack;
import java.util.Scanner;
import java.util.Random;
public class SnakeAndLadderGame {
public static void main(String[] args) {
	Random rand=new Random();
	int randomNum=rand.nextInt(6)+1;
	int position;
	Scanner sc=new Scanner(System.in);
	//System.out.println("Press 1 to continue");
	//int num=sc.nextInt();
	//while(num==1) {
	for(position=0;position<=100;position++) {
	System.out.println("Dice is rolled and Dice number is "+randomNum);
	position=randomNum+position;
	if(position==7) {
		position=36;//ladder from position 7 to 36
		System.out.println("new position is "+position);
		System.out.println("Press 1 to continue");
		int num=sc.nextInt();
		if(num==1) {
			//System.out.println("Dice is rolling");
			break;
		}
	}else if(position==68){
	position=92;  //ladder from position 68 to 92
	}else if(position==99){
		position=77;  //snake from position 99 to 77
	}else if(position==54){
		position=19;  //snake from position 54 to 19
}}
}}