import java.util.*;

public class ReverseWords{
    public static String Reverse(String s){
        String str[]=s.trim().split("\\s+"); 
        StringBuilder sb=new StringBuilder();
        for(int i=str.length-1; i>=0; i--){
            sb.append(str[i]);
            sb.append(" ");

        }
        return sb.toString().trim();
    }


    public static void main(String args[]){
        String s="my name is dheeraj";
        System.out.print(Reverse(s));

    }
}