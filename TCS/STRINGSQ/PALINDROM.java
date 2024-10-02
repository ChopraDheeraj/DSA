//Check if a given string is palindrome or not
import java.util.*;

public class PALINDROM{
    public static boolean calc(String s){
        StringBuilder sb = new StringBuilder(s);
        
        for(int i=0; i<s.length()/2; i++){
            //swap
            if(sb.charAt(i) != sb.charAt(sb.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        calc(s);
        
            if(calc(s) == true){
                System.out.print("PALINDROME");
            }
            else{
                System.out.println("NOT PALINDROME");
            }
        
    }
}