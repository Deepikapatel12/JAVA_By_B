import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 digit number");
        String number = scan.nextLine();
        for (int i = 1; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            int digit = Integer.parseInt(digitChar + "");
            if (digit % 2 == 0) {
                System.out.println("Even number" + digit);
            }

        }
    }
}
