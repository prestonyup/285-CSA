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
    (c) Delete an element from array 'list2' *
    (d) Average all of the elements in array 'list2'
(5) Call functions/methods
*/

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class gradeArray {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list1 = {80, 90, 75, 100};
        ArrayList<Integer> list2 = new ArrayList<>();

        while (true) {
            System.out.println("\nSelect which function to use");
            System.out.println("\n(1) Add grades\n(2) Delete grades\n(3) Print current list\n(4) Average all (quit)");
            
            int selection = input.nextInt();
            input.nextLine();

            if (selection == 1) {
                addGradesLoop(input, list2);
                
                Collections.sort(list2);
            }

            else if (selection == 2) {
                deleteGrade(input, list2);
            }

            else if (selection == 3) {
                printList(list2);
            }

            else if (selection == 4) {
                printAverage(list2);
                System.out.println("finish");
                break;
            }
            
            else {
                System.out.println("Invalid selection. Please choose 1, 2, 3, or 4.");
            }
        }

        input.close();
    }

    public static void addGradesLoop(Scanner input, ArrayList<Integer> list) {
        while (true) {
            System.out.println("Enter a grade value (0-100) or type 'stop' to return to menu:");
            String check = input.nextLine().trim();

            if (check.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                int grade = Integer.parseInt(check);
                
                if (grade < 0) grade = 0;
                if (grade > 100) grade = 100;
                
                list.add(grade);
                System.out.println("Grade " + grade + " added.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'stop'.");
            }
        }
    }

    public static void deleteGrade(Scanner input, ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        System.out.println("Enter the exact grade value you want to delete:");
        int gradeToDelete = input.nextInt();
        input.nextLine();

        if (list.remove(Integer.valueOf(gradeToDelete))) {
            System.out.println("Successfully deleted grade: " + gradeToDelete);
        } else {
            System.out.println("Grade not found in the list.");
        }
    }

    public static void printList(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("The list is currently empty.");
            return;
        }
        System.out.println("--- Current Grades (Sorted) ---");
        list.forEach(grade -> System.out.println("- " + grade));
    }

    public static void printAverage(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            System.out.println("No grades entered");
            return;
        }

        double sum = 0;
        for (int grade : list) {
            sum += grade;
        }
        double average = sum / list.size();
        System.out.printf("Average of all %d grades: %.2f\n", list.size(), average);
    }
}
