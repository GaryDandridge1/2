
/**
 * Class: Month
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: September 11, 2023
 * description: 1.15.15 This program will show how to calculate the area and perimeter.
 */

package src.Multibranching;

import java.util.Scanner;
public class Month {
    public static.void.main(String[] args){
        int singleDigit = input.nextInt();

        if(singleDigit == 1){
            System.out.println("Janaury");
        }
        else if(singleDigit == 2){
            System.out.println("Februry");
        }
        else if(singleDigit == 3){
            System.out.println("March");
        }
        else if(singleDigit == 4){
            System.out.println("April");
        }
        else if(singleDigit == 5){
            System.out.println("May");
        }
        else if(singleDigit == 6){
            System.out.println("June");
        }
        else if(singleDigit == 7){
            System.out.println("July");
        }
        else if(singleDigit == 8){
            System.out.println("August");
        }
        else if(singleDigit == 9){
            System.out.println("September");
        }
        else if(singleDigit == 10){
            System.out.println("October");
        }
        else if(singleDigit == 11){
            System.out.println("Novermber");
        }
        else if(singleDigit == 12){
            System.out.println("December");
        }
        else(singleDigit < 12) {
            System.out.println("Does not compute." + "Please input a number 1-12.");
        }
    }
}
