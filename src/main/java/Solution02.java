/*
 *  UCF COP3330 Fall 2021 Assignment 1 Exercise 2
 *  Copyright 2021 Matthew  Trump
 *
 *  This program will print a line asking for a string
 *  Then it will take input from the user
 *  Finally, it will print a message with the string and the
 *  amount of characters in said string
 */

import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {
        int num;
        Scanner n = new Scanner(System.in);

        System.out.println("What is the input string? ");
        String input = n.nextLine();

        System.out.println(input + " has " + input.length() + " characters.");
    }
}
