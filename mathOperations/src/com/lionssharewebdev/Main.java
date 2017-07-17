package com.lionssharewebdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    double sum;
	    double diff;
	    double div;
	    double multiply;
	    int remainder;

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



    }



    /*

    public static void showResults(sum,diff,div,multiply,remainder){

	}

	*/
}
