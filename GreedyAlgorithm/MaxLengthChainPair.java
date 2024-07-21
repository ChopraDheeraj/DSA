import java.util.*;

public class MaxLengthChainPair {

    public static void main(String args[]){
        int pairs[][] = {{5,24}, {39,60}, {5,28}, {27,40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));  //1st column sorted i.e 2nd no

        //for 1st pair
        int chainLen = 1;
        int chainEnd = pairs[0][1]; //last selected pair end //chain end
        //for rest pairs

        for(int i=0; i<pairs.length; i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
