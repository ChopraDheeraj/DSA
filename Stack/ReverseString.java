import java.util.*;

public class ReverseString{

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        //Step-1) push elements into stack
        int idx = 0;
        while(idx < str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        //Step-2) pop the elements from stack and push into stack builder
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()){
            char curr = s.pop();
            result.append(curr); //append adds element to last
        }
        
        return result.toString().trim();
    }

    public static void main(String args[]){
        String str = "  Hello World  ";
        System.out.println(reverseString(str));
    }
}