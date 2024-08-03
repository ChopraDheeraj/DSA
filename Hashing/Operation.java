import java.util.*;

public class Operation {
    
    public static void main(String args[]){
        HashMap<String, Integer> m = new HashMap<>();
        m.put("India", 1);
        m.put("Pakistan", 2);
        m.put("China", 4);

        System.out.println(m);
        System.out.println(m.get("India"));
        System.out.println(m.containsKey("India"));
        System.out.println(m.get("Turkey"));
        System.out.println(m.remove("India"));
        System.out.println(m);

        
    }
}
