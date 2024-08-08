import java.util.Scanner;

public class Newmain {
    public static void main(String[] args) {
        System.out.println("Deepika");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter any value");
        int number = scan.nextInt();
        if(number % 5 == 0){
            System.out.println("deepikapatel12@gmail.com");
        }
        else{
            System.out.println("No contact information avilable");
        }
    }
}
