/**
 * Class: Lexicographic
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 4.11.3. Exercise 3 This program is to take in grade give the highest and lowest number. But, if 'c' is press it will exit
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class HighandLowGrade {
    public static void main(String[] args) {
        ArrayList<Integer> gradesList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To exit program please enter at less one number press enter.");
        System.out.println("Then press C and hit enter.");
        boolean scores = true;
        while (scores = true) {
            System.out.print("Enter grade, or enter 'c' to end: ");
            String n = scanner.nextLine();

            if (!n.equals("c")) {
                try {
                    int grade = Integer.parseInt(n);
                    gradesList.add(grade);
                    scores = true;
                } catch (NumberFormatException e) {
                    System.out.println("This input is not a number!");
                }
                scores = false;
            }
            else{
                System.out.println("List of grades: " + gradesList);
                int lowest_num = Collections.min(gradesList);
                int highest_num = Collections.max(gradesList);
                System.out.println("The lowest grade is: " + lowest_num);
                System.out.println("The highest grade is: " + highest_num);
                System.exit(0);
            }
        }
    }
}