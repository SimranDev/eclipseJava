package com.training.java;

import java.util.Scanner;

public class WhileAndDoWhileLoop {

	public static void myPrintLine() {
		int myAsterisks = 50;            //WHILE LOOP
		while(myAsterisks >= 0) {
			System.out.print("*");
			myAsterisks--;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		myPrintLine();
		
		Scanner scanner = new Scanner(System.in);         //DO WHILE LOOP
		int input;
		do {
            System.out.println("Enter a number (-1 to exit):");		
            
			input = scanner.nextInt();
			if(input<=0) {
				System.out.println("Program Closed");
			}
			else if(input % 2 == 0) {
				System.out.println("Number is Even");
			}
			else {
				System.out.println("Number is Odd");
			}
		} while (input != -1);
		
		myPrintLine();
	}
}
