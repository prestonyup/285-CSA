import java.util.Scanner;

public class TelephoneNumberWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your phone number -- formatted as: (XXX) XXX-XXXX -- ");
        String rawNum = input.nextLine();
        input.close();
    }

    public static String removeExcess() {
        String allowedData = "[^0-9()//s-]";
        String cleanedNum = rawNum.replaceAll(allowedData, "");
    }
}
