// broken program lowkey scrap ts :sob:
import java.util.Scanner;

public class nameN{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the name? (Or stop) ");
        String name = input.nextLine();
        System.out.print("How many times printed?" );
        int num = input.nextInt();

        while(name!= "Stop"){
            For(i=0; i<num; i++){
                System.out.println("Hello" + name + "!");
                }name = input("What is the name? (Or stop) ");
                num = input("How many times printed?" );
            }
        input.close();
        }
    }