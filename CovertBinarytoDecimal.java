/**
 * Class: Covert Binary to Decimal
 * @author: Gary Dandridge
 * @version 1.3
 * course: ITEC 2140 p 09, fall 2023
 * written on: August 19, 2023
 * description: 1.15.5 This program is Covert Binary to Decimal on original numbers
 **/
public class CovertBinarytoDecimal {
    public static void main(String[] args) {
        //Use 0B to covert from Decimal to Binary.
        int n1 = 0B00000101;
        int n2 = 0B00110110;
        int n3 = 0B111011001;
        int n4 = 0B101010101;
        //Show on Screen Results from Covert.
        System.out.println("Covert first number to decimal:" + n1);
        System.out.println("Covrert second number to decimal:" + n2);
        System.out.println("Covert third number to decimal:" + n3);
        System.out.println("Covert forth number to decimal:" + n4);
    }
}