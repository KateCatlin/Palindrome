package com.palindrome.java;

/**
 * Created by katecatlin on 9/15/14.
 */

import java.util.Scanner;


public class Palindrome {


    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        String userWord;
        String userWordUp;
        boolean tastesLikeCandy = false;

            System.out.println("Welcome to the palindrome tester!");
            System.out.println("Enter a word to test: ");
        userWord = myScanner.nextLine();

        userWord = userWord.toLowerCase();
        userWord = userWord.replace(" ", "");
        userWordUp = new StringBuilder(userWord).reverse().toString();

            if (userWord.equals(userWordUp)) {
                tastesLikeCandy = true;
                System.out.println("It's a palindrome!");
            } else
            {System.out.println("Sorry, that's not a palindrome! Try again!");
            tastesLikeCandy = false;}

    }
}
