package com.training.java;

public class Array_LoopExample {

	public static void main(String[] args) {
		double[] myArray = {1.2, 7.5, 6.3, 9.44};
		
		//Finding largest element using for loop
		double largestElement = myArray[0];
		
		for(int i=0; i<myArray.length; i++) {
			if(myArray[i] > largestElement) {
				largestElement = myArray[i];	
			}
		}
		System.out.println("The largest element in this Array is "+largestElement);	
		
		//Printing all element using advanced For Loop
		for(double myVar:myArray) {
			System.out.print(myVar+"  ");
		}
	}
	
}
