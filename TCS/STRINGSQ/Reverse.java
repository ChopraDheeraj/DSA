//reverse string

import java.util.*;

public class reverse{
    
    public static void rev(String s){
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = sb.length()-1;
        while(j>i){
            //swap
            char ch = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, ch);
            i++;
            j--;
        }
        System.out.print(sb.toString());
    }
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    rev(s);
  }
}