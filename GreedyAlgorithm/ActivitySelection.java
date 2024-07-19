import java.util.*;


public class ActivitySelection {

    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //end time basis sorted
        int count = 0; 
        ArrayList<Integer> ans = new ArrayList<>(); //stores activities index

        //1st activity
        count = 1;    
        ans.add(0);    

        int lastEnd = end[0];   //last activity ka ending time kitna tha
        for(int i=1; i<end.length; i++){
            if(start[i] >= lastEnd){  //non overlapping condn 
                count++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activites = "+count);

        for(int i=1; i<ans.size(); i++){
            System.out.print(ans.get(i));
        }
        System.out.println();
    }
}
