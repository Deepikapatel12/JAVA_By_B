import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Number");
        String number = scanner.nextLine();
        for (int i = 1; i < number.length(); i++) {
            char digitChar = number.charAt(i);
            int digit = Integer.parseInt(digitChar + "");
            for(int j = i+1; j <= i; j++) {

                if(digitChar(j) == number && digitChar(i) == number)
                {
                    System.out.println(digitChar);
                }
            }
        }
    }
}