//remove vowels from string

import java.util.*;

public class RemoveVowel{
    
    public static String removeVowels(String s){
        s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        for(int i=0; i<sb.length()-1; i++){
        char ch = sb.charAt(i);
        if(ch == 'a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String st = removeVowels(s);
        System.out.print(st);
    }
}