/**
 * Class: EvenOdd
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 4.11.3-1. Exercise 3-1 This program is to write description will take in numbers.
 * Take number apart and make sure the ood  and even.
 * then will add up numbers for even.
 * The times for odd.
 */
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isNumber = true;
        while (isNumber) {
            try {
                System.out.print("Enter a number between 1 and 1000: ");
                int n = scanner.nextInt();
                boolean numbers = true;
                int evenNumbers = 0;
                int oddNumbers = 1;
                while (numbers) {
                    if (n >= 1 && n <= 1000) {
                        for (int i = 1; i <= n; i++) {
                            if (i % 2 == 0) {
                                evenNumbers += i;
                                System.out.println("The sum of even numbers are: " + evenNumbers);
                            }
                            if(i % 2 != 0) {
                                oddNumbers *= i;
                                System.out.println("The product of odd numbers are: " + oddNumbers);
                            }
                        }
                        break;
                    }
                    else {
                        System.out.println("Number is not between 1 and 1000. Please try again.");
                        break;
                            }
                        }
                    }
                catch (Exception e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                        scanner.nextLine();
                    }
                }

            }
        }
