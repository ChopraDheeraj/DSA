//determine if 2 strings are anagram of each other
//race and care are anagram

import java.util.*;

public class Q4{


public static boolean Q4(String str1, String str2){
    // Remove spaces and convert to lowercase to ignore case and spaces
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();

    // If lengths are not the same, they can't be anagrams
    if (str1.length() != str2.length())
        return false;

    // Convert strings to character arrays and sort them
    char[] charArray1 = str1.toCharArray();
    char[] charArray2 = str2.toCharArray();
    Arrays.sort(charArray1);
    Arrays.sort(charArray2);

    // Compare sorted arrays
    return Arrays.equals(charArray1, charArray2);
}


    public static void main(String args[]){
        String str1=new Scanner(System.in).next();
        String str2=new Scanner(System.in).next();
        System.out.print(Q4(str1,str2));

    }
}