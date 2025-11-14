import java.util.Scanner;
/* Write a program that uses the Scanner class and the newer IO class to read a user's name and age, then print a personalized greeting.
 */
public class ScannerClass {
    public static void main (String[]args){

        // using scanner
        Scanner input = new Scanner(System.in);

        IO.print("Enter your name: ");
        String name1 = input.nextLine();

        IO.print("Enter your age: ");
        int age1 = input.nextInt();

        IO.println("My name is " + name1 + ", Im " + age1 + " year old.");




    }
}
