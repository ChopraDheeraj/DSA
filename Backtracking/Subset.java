import java.util.*;

public class Subset{

    public static void findSubset(String str, String ans, int i){ //i is index
        //base case
        if(str.length() == i){
            if(ans.length()==0){
                System.out.print("null");
            }
            else{
            System.out.print(ans);
            }
            return;
        }
        //yes choice
        findSubset(str, ans+str.charAt(i), i+1);
        //no choice
        findSubset(str, ans, i+1);


    }

    public static void main(String args[]){
        String str = "abc";
        findSubset(str, " ", 0);
    }
}