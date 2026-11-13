/*
(1) Input words into ArrayList<String> list using a standard for loop
(2) Traverse the list suing a "for: each" loop and create a second "newlist" of only words of length num
(3) Print out the "newlist" and remove elements using a while (! newlist.isEmpty()) loop
*/

import java.util.Scanner;
import java.util.Collections;
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
        System.out.println("Your List:" + wordList);

        //input.close();
    }
}