/**
 * Class: ONes and Twos Complements
 * @author: Gary Dandridge
 * @version 1.4
 * course: ITEC 2140 p 09, fall 2023
 * written on: August 19, 2023
 * description: 1.15.4 This program is Ones and Twos Complements on original numbers
 **/
public
class OnesandTwoscomplementsTest {
    public static void main(String[] args) {
        //Ones Complement
        int n1 = 51;
        int n2 = 140;
        int n3 = 1501;
        int invert1 = 204;
        int invert2 = 115;
        int invert3 = 2594;
        int number1 = n2 + invert1;
        int number2 = n2 + invert2;
        int number3 = n3 + invert3;
        System.out.println("Result of ONE COMPLEMENT:" + number1 + " Coverting number back to Binary: " + Integer.toBinaryString(number1));
        System.out.println("Result of ONE COMPLEMENT:" + number2 + " Coverting number back to Binary: " + Integer.toBinaryString(number2));
        System.out.println("Result of ONE COMPLEMENT:" + number3 + " Coverting number back to Binary: " + Integer.toBinaryString(number3));

        //TWO COMPLEMNTS
        int invert4 = 205;
        int invert5 = 116;
        int invert6 = 2595;
        int number4 = n1 + invert4;
        int number5 = n2 + invert5;
        int number6 = n3 + invert6;
        System.out.println("Result of Two's COMPLEMENT:" + number4 + " Coverting number back to Binary: " + Integer.toBinaryString(number4));
        System.out.println("Result of Two's COMPLEMENT:" + number5 + " Coverting number back to Binary: " + Integer.toBinaryString(number5));
        System.out.println("Result of Two's COMPLEMENT:" + number6 + " Coverting number back to Binary: " + Integer.toBinaryString(number6));

        }
}