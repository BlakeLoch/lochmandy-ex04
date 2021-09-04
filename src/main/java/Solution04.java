/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Blake Lochmandy
 */

import java.util.Scanner;

public class Solution04 {
    /*
        Print "Enter a noun:"
        'noun' = read string from user
       Print "Enter a verb:"
        'verb' = read string from user
        Print "Enter an adjective:"
        'adjective' = read string from user
         Print "Enter an adverb:"
        'adverb' = read string from user
        Print "The (adjective) (noun) (verb) (adverb)."
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a noun: ");
        String noun = input.nextLine();
        System.out.print("Enter a verb: ");
        String verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        String adjective = input.nextLine();
        System.out.print("Enter an adverb: ");
        String adverb = input.nextLine();
        System.out.printf("The %s %s %s %s.", noun, verb, adjective, adverb);
    }
}
