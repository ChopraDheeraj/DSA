//optimised O(n)

import java.util.*;

public class MaxWater{

    public static int calcMaxWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(rp>lp){
            int hight = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currWaterLevel = hight * width;
            maxWater = Math.max(maxWater, currWaterLevel);

            if(height.get(lp) < height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
            
        }
        return maxWater;
    }


    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(2);
        height.add(6);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        System.out.print(calcMaxWater(height));
    }
}