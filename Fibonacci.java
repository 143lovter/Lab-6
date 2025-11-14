import java.util.Scanner;
/*  Write a program to display the Fibonacci series up to N terms.
 */
public class Fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        IO.print("Enter N terms: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        IO.print("Fibonacci Series: ");

        for (int i=1; i<=n; i++){
            IO.print(a + " ");
            int next = a+b;
            a=b;
            b=next;
        }
    }
}
