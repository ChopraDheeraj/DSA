// count how many times lowercase vowels occured in a String entered by the user
//lower case vowels a,e,i,o,u
// INPUT: Dheeraj Output:3

import java.util.*;

public class Q1{
    public static String countLowerCase(String str){
        int count=0;
        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                count++;
            }
        }   
        return str.valueOf(count);
    }

    public static void main(String args[]){
        String str=new Scanner(System.in).next();
        System.out.println(countLowerCase(str));
    }
}