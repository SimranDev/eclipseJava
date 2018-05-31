package com.training.java;

import java.util.Scanner;

public class IfElse {
public static void main(String[] args) {
	Scanner scanner =  new Scanner(System.in);
			System.out.println("Enter a number: ");
	int x = scanner.nextInt();
	
	if(x==7) {
		System.out.println("X is 7");
	}
	else {
		System.out.println("X is not 7, New value?");
	}
}
}
