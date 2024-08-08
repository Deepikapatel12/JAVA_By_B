import java.util.Scanner;

public class isPrime {
    
    public class PrimeNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Any Number");
            int number= scanner.nextInt();
            if(number > 1){
                int countDivisiblity = 0;
                for (int i = 1; i <=number; i++) {
                    if(number % i ==0)
                    {
                        countDivisiblity++;
                    }
                }
                if(countDivisiblity == 2)
                {
                    System.out.println("Prime Number");
                }
                else
                {
                    System.out.println("Not a Prime Number");
                }
            }
            else
            {
                System.out.println("Enter A valid Number");
            }
        }
    }

}
