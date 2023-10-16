/**
 * Class: Lexicographic
 * @author: Gary Dandridge
 * @version 1.0
 * course: ITEC 2140 p 09, fall 2023
 * written on: October 15, 2023
 * description: 4.11.1. Exercise 1 This program is to take in number grade numbers and aff them together. But, if 'c' is press it will exit
 */
import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        int sum = 0;
        int add = 0;
        int round = 4;
        boolean scores = true;
    while(scores=true){
        for (int x = 2; x <= round; x++) {
            Scanner sumof = new Scanner(System.in);
            System.out.println("Enter a your numbers: ");
            System.out.println("Enter c you will end the program");
            String yoursum = sumof.nextLine();//reads string
    if(!yoursum.equals("c")){
        try{
            sum = Integer.parseInt(yoursum);
            add = add + sum;
            scores = false;
        }
        catch(NumberFormatException e){
            System.out.println(" Your sum of your grades is: " + add);
break;
        }
        scores =false;
    }

    else{
        System.out.println("You Ended the program by pressing c and hitting enter");
        System.out.println(" Your sum of your grades is: " + add);
        System.exit(0);

    }
        }

        }

    }

}
