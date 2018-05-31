package com.training.java;

public class RelationalOperator {
public static void main(String[] args) {
	int x=5;
	int y=10;
	
	int ternaryResult = (x==5 ) ? 0 : -1; //Ternary Operator
	System.out.println("ternaryResult is " + ternaryResult);
	
	boolean result = ((x==5)||(y==6)); //Conditional OR
	System.out.println("OR Result is "+result);
	
	boolean result2 = ((x==5)&&(y==10)); //Conditional AND
	System.out.println("AND Result is "+result2);
	

}
}

