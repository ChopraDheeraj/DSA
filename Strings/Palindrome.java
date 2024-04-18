import java.util.*;

public class Palindrome{

    public static boolean isPalindrome(String s1){
        for(int i=0; i<s1.length()/2; i++){
            int n=s1.length();
            if(s1.charAt(i) != s1.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String s1= sc.next();
        System.out.print(isPalindrome(s1));       
    }
}