import java.util.Scanner;
/*  Write a program that inputs 5 numbers and stores them in an array, then calculates and prints their sum and average.
*/
public class Array {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int[]numbers = new int [5];
        int sum=0;

        IO.println("Enter 5 numbers: ");

        for (int i=0; i<5; i++){
            numbers[i]=input.nextInt();
            sum+=numbers[i];
        }
         double average = sum/5.0;
        IO.print("Sum: " + sum + ", Average: " + average);


    }
}
