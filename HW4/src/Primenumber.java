/**
 * Class: Lexicographic
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 4.11.1. Exercise 1 This program is to take in number a decide if it a prime number ot not a prime number.
 */
import java.util.Scanner;
public class Primenumber{
    public static void main(String[] args) {
        System.out.println("Please type and number in: ");
        Scanner num = new Scanner(System.in);
        int numbers = num.nextInt();

        boolean PrimeNum = true;
        for (int x = 2; x < numbers; x++) {
            if (numbers % x == 0) {
                PrimeNum = false;
                System.out.print(numbers + " is  not a prime number");
                break;
            }
        }
        System.out.println(numbers + " is prime number");
    }
}
