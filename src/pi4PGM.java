/*
(1) Define pi/4
(2) Take in amount of terms for the approximation
(3) Calculate the approximation of pi/4 using the series:
    a = (pi/4) - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + ...
(4) Output the approximation of pi/4
*/

import java.util.Scanner;

public class pi4PGM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step (1)
        double pi4 = Math.PI / 4;

        // Step (2)
        System.out.print("Enter the number of terms for the approximation: ");
        int terms = input.nextInt();

        // Step (3)
        double approximation = 0;
        for (int i = 0; i <= terms; i++) {
            approximation += Math.pow(-1, i) / (2 * i + 1);
        }

        // Step (4)
        System.out.println("The approximation of pi/4 using " + terms + " terms is " + approximation);

        input.close();
    }
}