import java.util.*;

public class ItenaryTickets {

    public static String calcStart(HashMap<String, String> tickets){
        HashMap<String, String> revMap = new HashMap<>();

        for (String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }
        
        for (String key : tickets.keySet()) {
            if(!revMap.containsKey(key)){
                return key; //1st element
            }
        }
        return null;
    }

    public static void main(String args[]){
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bangalore");
        tickets.put("mumbai", "delhi");
        tickets.put("goa", "chennai");
        tickets.put("delhi", "goa");

        String start = calcStart(tickets);
        System.out.print(start);

        //printing other
        for (String key : tickets.keySet()) {
            System.out.print(" "+tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();

    }
}
