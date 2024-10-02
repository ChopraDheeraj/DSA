// remove spaces from a string

import java.util.*;

public class RemoveSpaces{
    
    public static String removeSpace(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch == ' '){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String d1 = removeSpace(s);
        System.out.print(d1);
        
        
    }
}