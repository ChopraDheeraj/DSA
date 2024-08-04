import java.util.*;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.get(ch)!= null){   //agar map mei ch vali key exist krti h
                if(map.get(ch) == 1){  //aur agar freq=1
                    map.remove(ch);    //fir element remove krdo
                }
                else{
                    map.put(ch, map.get(ch) - 1);  //aur agar freq 1 se badi h, usko -1 krdena h
                }
            }
            else{
                return false;
            }
        }
        return map.isEmpty();
    }

    
    
    public static void main(String args[]){
        String s = "race";
        String t = "care";
        System.out.print(isAnagram(s, t));
    }
}
