import java.util.Scanner;
/* Write a program to check if an input string is a palindrome (reads the same forwards and backwards). */
public class Palindrome {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        IO.print("Enter a word: ");
        String text=sc.nextLine();

        String reversed = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversed)){
            IO.println(text + " is a palindrome.");
        } else {
            IO.println(text + " is NOT a palindrome.");
        }

    }
}
