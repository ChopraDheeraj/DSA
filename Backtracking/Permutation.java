import java.util.*;

public class Permutation{

    public static void calcPermutation(String str, String ans){
        if(str.length() == 0){
            System.out.print(ans);
            return;
        }
        for(int i=0; i<str.length(); i++){
        char curr = str.charAt(i);   
        //abcde = ab + de //c hat jayega
        String Newstr = str.substring(0, i) + str.substring(i+1);
        calcPermutation(Newstr, ans+curr);
        }
    }

    public static void main(String args[]){
        String str = "cab";
        calcPermutation(str, " ");

    }
}