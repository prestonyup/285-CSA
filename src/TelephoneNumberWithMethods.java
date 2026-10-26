import java.util.Scanner;

public class TelephoneNumberWithMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your phone number -- formatted as: (XXX) XXX-XXXX -- ");
        String rawNum = input.nextLine();
        String cleanedNum = removeExcess(rawNum);
        Boolean isValid = checkLength(cleanedNum);
        if (isValid) {
            Boolean isChecked = checkFormat(cleanedNum);
            if (isChecked) {
                // go here
            }
            else {
                System.out.println("The number you entered is invalid.");
            }
        }
        else {
            System.out.println("The number you entered is invalid.");
        }

        input.close();
    }

    public static String removeExcess(String num) {
        String allowedData = "[^0-9()//s-]";
        String cleanedNum = num.replaceAll(allowedData, "");
        return cleanedNum;
    }

    public static Boolean checkLength(String num) {
        if (num.length() == 13) {
            return true;
        } else {
            return false;
        }
    }

    public static Boolean checkFormat(String num) {
        if (num.charAt(0) == '(') {
            if (num.charAt(4) == ')') {
                if (num.charAt(8) == '-') {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }
}
