package com.lionssharewebdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    System.out.println("Please enter a number.");
        Scanner scanner1 = new Scanner(System.in);
        String input1  = scanner1.nextLine();
		System.out.println("The first number is " + input1);

        System.out.println("Please enter a second number.");
        Scanner scanner2 = new Scanner(System.in);
        String input2 = scanner2.nextLine();
		System.out.println("The second number is " + input2);

		double operand1 = Double.parseDouble(input1);
		double operand2 = Double.parseDouble(input2);

		double sum = operand1 + operand2;

		double diff = operand1 - operand2;

		double div = operand1 / operand2;

		double multiply = operand1 * operand2;

		double remainder = operand1 % operand2;

		showResults(sum,diff,div,multiply,remainder);

    }




    public static void showResults (double sum, double diff, double div, double multiply, double remainder){

    	System.out.println("The sum of both numbers is: " + sum);

		System.out.println("The difference of both numbers is: " + diff);

		System.out.println("The result of multiplying both numbers is : " + multiply);

		System.out.println("Both numbers divided are : " + div);

		System.out.println("The remainder of both operands " + remainder);


	}


}
