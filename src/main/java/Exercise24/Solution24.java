/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solutions
 *  Copyright 2021 Garrett Adams
 */

package Exercise24;

//Imports all util
import java.util.*;

public class Solution24 {
    //Creates isAnagram Function
    static boolean isAnagram(String UserWord1, String UserWord2) {
        //Defines the variables we will be using in isAnagram
        boolean CalcAnagram;
        char[] ArrayWord1;
        char[] ArrayWord2;

        //Converts the user input string to character arrays
        ArrayWord1 = UserWord1.toCharArray();
        ArrayWord2 = UserWord2.toCharArray();
        //Sorts the arrays by ascending
        Arrays.sort(ArrayWord1);
        Arrays.sort(ArrayWord2);

        //If the arrays have same elements
        if (Arrays.equals(ArrayWord1, ArrayWord2)) {
            CalcAnagram = true;
        }
        //If they do not have same elements
        else {
            CalcAnagram = false;
        }

        //Returns true for same elements
        if (CalcAnagram == true) {
            return true;
        }
        //Returns false for different elements
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        //Creates variables we will be using in main
        String UserWord1;
        String UserWord2;
        //Sets up scanner
        Scanner ScanWord = new Scanner(System.in);

        //Asks user for input
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.println("Enter the first string: ");
        //Scans user input to UserWord1
        UserWord1=ScanWord.nextLine();

        //Asks user for input
        System.out.println("Enter the second string: ");
        //Scans user input to UserWord2
        UserWord2=ScanWord.nextLine();
        //If inputs are an anagram
        if(isAnagram(UserWord1,UserWord2))
            System.out.println("'" + UserWord1 + "' and '" + UserWord2 + "' are anagrams.");
        //If inputs are not an anagram
        else
            System.out.println("'" + UserWord1 + "' and '" + UserWord2 + "' are not anagrams.");
    }
}
