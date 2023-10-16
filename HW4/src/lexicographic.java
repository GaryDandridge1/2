/**
 * Class: Lexicographic
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 4.11.7. Exercise 7 This program is to write two strings and oganize the string to print out which one is the longest first.
 */

import java.util.Scanner;
import java.util.Arrays;


public class lexicographic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String string2 = scanner.nextLine();

        int string1_length = string1.length();
        System.out.println(string1_length);

        int string2_length = string2.length();
        System.out.println(string2_length);

        if (string1_length > string2_length) {
            System.out.printf("string '%s' is longer than string '%s'%n", string1, string2);
        } else {
            System.out.printf("string '%s' is longer than string '%s'%n", string2, string1);
        }

        String[] string_list = {string1, string2};
        Arrays.sort(string_list);
        System.out.print("Sorted list in order: ");
        System.out.println(Arrays.toString(string_list));

        System.out.printf("String '%s' appears before string '%s' in lexicographic order.%n", string_list[0], string_list[1]);

        System.out.printf("New sentence created is '%s %s'.%n", string1, string2);
    }
}

