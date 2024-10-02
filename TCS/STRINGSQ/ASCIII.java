import java.util.*;

public class ASCIII{

    public static void ASCII(char letter) {
        int Value = letter;  //character ko int ke equal krdenge
        System.out.println(Value);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letter = sc.next().charAt(0);
        
        ASCII(letter);
    }
}
