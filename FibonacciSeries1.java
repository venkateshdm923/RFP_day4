package com.bridgelabz.secondpack;
import java.util.Scanner;
public class FibonacciSeries1 {
	public static void main(String[] args) {
		
	
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number(series length)");
int num=sc.nextInt();

	System.out.println("Fibonacci series is"+"\n");
	
	int n1=0;
	int n2=1;
	System.out.print(n1+","+n2);
	for(int i=1;i<num;i++) {
		int n3=n1+n2;
				n1=n2;
		n2=n3;
		
		System.out.print(","+n3);
		
		
}
}}
