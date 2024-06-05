import java.util.*;

public class RemoveDuplicateString{

    public static void RemoveDuplicate(String str, int idx, StringBuilder newStr, boolean map[]){
        if(idx == str.length()){  //base case
            System.out.println(newStr);
            return;
        }

        //kaam
        char currChar = str.charAt(idx);
        if(map[currChar-'a'] == true){
            RemoveDuplicate(str, idx+1, newStr, map);
        }
        else{
            map[currChar-'a'] = true;
            RemoveDuplicate(str, idx+1, newStr.append(currChar), map);
        }

    }

    public static void main(String args[]){
        String str = "apnacollege";
        RemoveDuplicate(str, 0, new StringBuilder(""), new boolean[26]);
    }
}