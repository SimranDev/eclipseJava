package com.training.java;

import java.util.Scanner;

public class SampleClass {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		
		//read name of user
		System.out.println("Enter your name: ");
		String name = scanner.next();
		System.out.println("Your name is "+name);
		
	}
}
