/**
 * Class: Lexicographic
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 4.11.5. Exercise 5 This program is to take any number under 5 and factorial it.
 */
import java.util.Scanner;

public class Factorial{
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter a number: ");
                int n = scanner.nextInt();
                int user_input = n;
                int number = 1;
                for (int i = 1; i <= n; i++) {
                    number *= n;
                    n--;
                }
                System.out.println("The factorial of '" + user_input + "' is: " + number);
           }
}
