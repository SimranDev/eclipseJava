package com.training.java;

public class ForLoop {
public static void main(String[] args) {
	
	/** for(int i=0; i<=15; i++) {
		System.out.print(i+" ");
	} **/
	
	//Array initialization
//	int[] myArray = {1,2,3,4,5,6,7};
//	
//	/** for(<type> <variable> : collection){                 //ADVANCED FOR LOOP SYNTAX 
//	} **/
//	for(int myVar : myArray) {
//		System.out.print(myVar + " ");
//	}
	
	int i,j;
	for(i=0; i<10; i++) {
		for(j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
