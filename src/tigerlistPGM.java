/*
(1) Input words into ArrayList<String> list using a standard for loop
(2) Traverse the list using a "for: each" loop and create a second "newlist" of only words of length num
(3) Print out the "newlist" and remove elements using a while (! newlist.isEmpty()) loop
*/

import java.util.Scanner;
import java.util.ArrayList;

public class tigerlistPGM {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Step (1)
        ArrayList<String> wordList = new ArrayList<>();
        String option = "";
        while (!option.equals("stop")) {
            System.out.print("What word would you like to add? (or 'stop') ");
            option = input.nextLine();
            if (!option.equals("stop")) {
                wordList.add(option);
            }
        }

        // Step (2)
        System.out.println("This is your list of terms:");
        for (String item : wordList) {
            System.out.println(item);
        }
        System.out.println("What is the length of the terms you wish to create a new list for? ");
        int termLength = input.nextInt();
        ArrayList<String> newList = new ArrayList<>();
        for (String item : wordList) {
            if (item.length() == termLength) {
                newList.add(item);
            }
        }

        // Step (3)
        while (!newList.isEmpty()) {
                System.out.println("This is your new list of terms:");
                System.out.println(newList);
                newList.clear();
            }
            input.close();
        }
    }