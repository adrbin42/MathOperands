package com.adriennebing;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int randNum = (int) (Math.random() * 100 + 1);
        int count = 0;
        int userInput = 0;



        while (userInput != randNum) {

            System.out.println("Please guess a number from 1 to 100");

            Scanner scanner = new Scanner(System.in);
            userInput = scanner.nextInt();

            System.out.println("The number you entered is: " + userInput);

            if (randNum > userInput) {
                System.out.println("Your guess is too low try again.");
                count = count + 1;
            } else if (randNum < userInput) {
                System.out.println("Your guess is too high try again.");
                count = count + 1;
            } else {
                System.out.println("Your guessed correctly.");
                System.out.println("It took you " + count + " tries.");
            }
        }

    }
}

