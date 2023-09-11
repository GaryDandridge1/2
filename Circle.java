/**
 * Class: Circle
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: August 20, 2023
 * description: 1.15.15 This program will show how to calculate the area and perimeter.
 */
public class Circle{
    public static void main(String[] args){
        double radius= 9.5;
        double MathPI= 3.14;
        double area = radius * radius * MathPI;
        double perimeter = 2 * radius * MathPI;
        System.out.println("Here is the area result: " + area);
        System.out.println("Here is the perimeter result: " + perimeter);
    }
}