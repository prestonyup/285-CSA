/*
(1) Create an ArrayList to contain the randomly generated numbers
(2) Generate random numbers between 1 and 100 using the Math.random method
(3) Take out the generated numbers and take the average of them all
*/

import java.util.*;

public class randomNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();

        System.out.println("How many numbers do you want to generate? ");
        int numCap = input.nextInt();
        
        for (int i = 1; i <=numCap; i++) {
            int numGen = (int)(Math.random()*100+1);
            numList.add(numGen);
            System.out.println(numList);
        }

        int denom = numList.size();
        int total = 0;
        for (Integer item : numList) {
            total += item;
        }

        int average = total/denom;
        System.out.println("..  The average of these terms:\n..  " + numList + "\n..  Is: " + average);

        input.close();

    }
}