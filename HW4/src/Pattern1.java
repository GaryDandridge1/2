/**
 * Class: Lexicographic
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 44.11.10. Exercise 10 This program is to take any number under 5 and factorial it.
 */
public class Pattern1 {
        public static void main(String[] args) {
                String stars = " ";
                int n = 7;
                while (n != 0) {
                        for (int i = 1; i < n; i++) {
                                stars += "*";
                        }
                        System.out.println(stars);
                        stars = " ";
                        n--;
                }


        }
}
