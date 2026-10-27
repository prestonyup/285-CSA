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
                printNumber(cleanedNum);
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

    public static void printNumber(String num) {
        String segment1 = num.substring(0, 5);
        String segment2 = num.substring(5, 8);
        String segment3 = num.substring(9, 13);

        System.out.println("This number's area code is" + segment1);
        System.out.println("This number's exchange number is " + segment2);
        System.out.println("This number's line number is " + segment3);
    }
}