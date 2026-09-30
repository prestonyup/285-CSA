/*
(1) Take in how many times to multiply 2
(2) Multiply 2 that many times
(3) Output the answer
*/

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step (1)
        System.out.print("How many times to multiply 2? ");
        int raise = input.nextInt();

        // Step (2)
        double two = 2;
        for (int i = 1; i < raise; i++) {
            two *= 2;
        }

        // Step (3)
        System.out.println(two);

        input.close();
    }
}