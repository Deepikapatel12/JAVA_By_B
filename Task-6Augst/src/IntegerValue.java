import java.util.Scanner;

public class IntegerValue {
    public static void main(String[] args) {
        System.out.println("enter 1st integer values");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println("enter 2nd integer value");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(number >0 && num >0 && number %2==0 && num % 2 ==0){
            int number1=  number * num;
            System.out.println(number1);
        }

    }
}
