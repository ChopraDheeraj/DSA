import java.util.*;

public class main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = "";
        char ch;
        
        for(int i=0; i<s1.length(); i++){
            ch = s1.charAt(i);
            s2 = ch + s2;
        }
        System.out.println(s2);
    }
}