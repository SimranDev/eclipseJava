package com.training.java;

import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter month number: ");
	int monthNumber = scanner.nextInt();
	
	String month = null;
	
	switch(monthNumber) {
	case 1: month = "Quarter 1";
	break;
	case 5: month = "Quarter 2";
	break;
	case 9: month = "Quarter4";
	break;
	default: month = "Unknown";
		}
	System.out.println("This month belongs to "+month);
}
}
