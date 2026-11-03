/*
Steps:
(1) Create a first static array 'list1' using an initializer list
(2) Create a second static array 'list2' using interactive input
    (a) Create function to loop until 'stop' is returned
    (b) Append each inputted value to array 'list2'
(3) Sort array 'list2'
(4) Create functions to do:
    (a) Print the array 'list2'
    (b) Insert more elements (ints) into array 'list2'
    (c) Delete an element from array 'list2'
    (d) Average all of the elements in array 'list2'
(5) Call functions/methods
*/

import java.util.Scanner;
import java.util.Arrays;

public class gradeArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list2 = {};

        System.out.println("Select which function to use!\nSelect using numbers 1-4\n(1) Add grades\n(2) Delete grades\n(3) Print current list\n(4) Average all grades (quit)");
        System.out.print("");
        int selection = input.nextInt();

        if (selection == 1) {
            addGrade();
        }

        if (selection == 2) {

        }

        if (selection == 3) {

        }

        if (selection == 4) {

        }

        input.close();
    }

    public static int addGrade() {
        Scanner input = new Scanner(System.in);
        boolean sentinel = false;

        while (!sentinel){
            System.out.println("What is the value of the grade you wish to add?");
            System.out.print("");
            int grade = input.nextInt();
        }
        input.close();
    }

}