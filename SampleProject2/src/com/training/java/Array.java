package com.training.java;

import java.util.Scanner;

public class Array {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in); //setting size of Array using user input on runtime
	System.out.print("Enter the size of Array: ");
	int arraySize = scanner.nextInt();
	
	int[] myArray = new int[arraySize];
	System.out.println("The size of Array is "+myArray.length );
	
}
}
