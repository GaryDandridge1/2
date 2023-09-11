/**
 * Class: Formula
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: August 18, 2023
 * description:1.15.7 This program will show how to transform real arithmetic expression
 * in to Java program expression
 */
public class Formula {
    public static void main(String[] args){
        float result = ((5.6f*5.6f-4*6.2f*5.1f)/(2*7.8f-3*5.6f));
        System.out.println("Result of this is: " + result);
        System.out.println("Result: " + (5.6f*5.6f-4*6.2f*5.1f)/(2*7.8f-3*5.6f));
        System.out.println("Result %.2f " +result); //put on same line
    }
} // 10.0 for decimals
