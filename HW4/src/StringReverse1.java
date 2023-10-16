
import java.util.Scanner;

public class StringReverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String reverse_string = "";
        System.out.println("Please enter word(s) to see it reverse: ");
        for (int i = string1.length() - 1; i >= 0; i--) {
            reverse_string += string1.charAt(i);
        }
        System.out.println(reverse_string);
        if (!reverse_string.equals(string1)) {
            System.out.printf("String value '%s' and its reverse '%s' are not equal.", string1, reverse_string);
        }
    }
}

