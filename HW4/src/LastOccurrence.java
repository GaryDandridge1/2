/**
 * Class: LastOccurence
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 4.11.9. Exercise 9 This program is to take in String and you input a letter to find it in the string.
 */
import java.util.Scanner;
public class LastOccurrence {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String string1 = scanner.nextLine();

            System.out.print("Enter a character: ");
            String char1 = scanner.nextLine();

            int find_char = string1.indexOf(char1);

            if (find_char != -1) {
                for (int i = string1.length() - 1; i >= 0; i--) {
                    if (string1.charAt(i) == char1.charAt(0)) {
                        int string_index = string1.lastIndexOf(char1);
                        System.out.printf("The last occurrence of character '%s' in '%s' is at %d.", char1, string1, string_index);
                        break;
                    }
                }
            } else {
                System.out.printf("The last occurrence of character '%s' in '%s' is at %d.", char1, string1, find_char);
            }

            System.exit(0);
        }
    }
