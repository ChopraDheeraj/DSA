//Remove brackets from an algebraic expression

import java.util.*;

public class Brackets{
    
    public static String remove(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length(); i++){
            if(sb.charAt(i) == '(' || sb.charAt(i) ==')'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print(remove(s));
    }
}