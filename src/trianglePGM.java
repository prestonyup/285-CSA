/*
(1) Input three sides of the potential right triangle
(2) Determine if the shape is a right triangle:
    (a) The sum of any two sides has to be bigger than the third
    (b) The square of the longest side has to be equal to the sum of the squares of the other two sides
(3) Find the longest side -- the hypotenuse
(4) Output whether the shape is a right triangle or not:
    (A) Is a right triangle (a+b)
    (B) Is a triangle, but not right (a, but not b)
    (C) Is not a triangle (!a+b)
*/

import java.util.Scanner;

public class trianglePGM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step (1)
        System.out.print("Enter the first side: ");
        int side1 = input.nextInt();
        System.out.print("Enter the second side: ");
        int side2 = input.nextInt();
        System.out.print("Enter the third side: ");
        int side3 = input.nextInt();

        // Step (2a)
        boolean isTriangle = (side1 + side2 > side3) && 
        (side1 + side3 > side2) && 
        (side2 +side3 > side1); 
            // && is logical AND operator

        if (!isTriangle) {
            System.out.println("The shape is not a triangle.");
            input.close();
            return;
        }

        // Step (2b)
        boolean isRightTriangle = (side1 * side1 + side2 * side2 == side3 * side3) ||
        (side1 * side1 + side3 * side3 == side2 * side2) ||
        (side2 * side2 + side3 * side3 == side1 * side1);
            // || is logical OR operator

        if (!isRightTriangle) {
            System.out.println("The shape is a triangle, but not a right triangle.");
        } else {
            // Step (3)
            int hypotenuse = Math.max(side1, Math.max(side2, side3));
            if (hypotenuse == side1) {
                System.out.println("The shape is a right triangle with sides: " + side2 + ", " + side3 + " and hypotenuse: " + side1);
            } else if (hypotenuse == side2) {
                System.out.println("The shape is a right triangle with sides: " + side1 + ", " + side3 + " and hypotenuse: " + side2);
            } else {
                System.out.println("The shape is a right triangle with sides: " + side1 + ", " + side2 + " and hypotenuse: " + side3);
            }
        }
        input.close();
    }
}