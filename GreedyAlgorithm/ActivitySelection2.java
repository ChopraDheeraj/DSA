import java.util.*;

public class ActivitySelection2 {

    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //sorting
        int activites[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++){
            activites[i][0] = i;
            activites[i][1] = start[i];
            activites[i][2] = end[i];
        }

        //lambda function ->short form
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2])); //matlab sorting column 2 ke basis par karni hai

        //end time basis sorted
        int count = 0; 
        ArrayList<Integer> ans = new ArrayList<>(); //stores activities index

        //1st activity
        count = 1;    
        ans.add(activites[0][0]);    

        int lastEnd = activites[0][2];   //last activity ka ending time kitna tha
        for(int i=1; i<end.length; i++){
            if(activites[i][1] >= lastEnd){  //non overlapping condn 
                count++;
                ans.add(activites[i][0]);
                lastEnd = activites[i][2];
            }
        }
        System.out.println("max activites = "+count);

        for(int i=1; i<ans.size(); i++){
            System.out.print(ans.get(i));
        }
        System.out.println();
    }
}
