import java.sql.SQLOutput;

public class MyMain {
    //WAP to chck the given chatecter is present in the given string
    //otherwise not found
    // string input = "Java ka Baba";
    // char search = 'k';
    public static void main(String[] args) {
        String name = "Java Ka Baba";
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < name.length(); i++) {
            char nameCharacter = name.charAt(i);
            if(name == 'k')
            {
                System.out.println("chatacter fount");
            }
            else {
                System.out.println("not fount");
            }
        }
    }
}
