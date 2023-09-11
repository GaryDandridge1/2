/**
 * Class: 9's Complements
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: August 19, 2023
 * description:1.15.3 This program is 9's Complements on original numbers
 **/
public class NinesComplements {
  public static void main (String[] args)  {
   int n1= 4535;
   int n2= 507606;
   int n3= 78534019;
   //9's Complements in original numbers
   int nines1= 9999;
   int nines2= 999999;
   int nines3= 99999999;
   int NUMBER1= nines1 - n1;
   int NUMBER2= nines2 - n2;
   int NUMBER3= nines3 - n3;
   //Show results on screen
   System.out.println("Result Of nines complements for first number is:" + NUMBER1);
   System.out.println("Result of nines complements for second number is:" + NUMBER2);
   System.out.println("Result of Nines Compleents for third number is:" + NUMBER3);
  }
}