
import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args)
    {
        double average = 0;
        double grades = 7;
        for (double x = 2; x <= grades; x++) {
            Scanner grade = new Scanner(System.in);
            System.out.println("Enter a your grades: ");
            String yourgrades = grade.nextLine();              //reads string
            double sum = Double.parseDouble(yourgrades);
            average += (sum/6);

        }
        System.out.println(" Your grade is: " + average + "%");
    }


}

