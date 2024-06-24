//Most Frequent Number following Key


import java.util.*;


public class Question3 {

    public static int findKey(ArrayList<Integer> nums, int key){
        int target = 0;
        int count = 0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == key && nums.get(i+1) == target){
                count++;
            }
        }
        return target;
    }
    
    public static void main(String args[]){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(100);
        nums.add(200);
        nums.add(1);
        nums.add(100);
        int key = 1;
        System.out.print(findKey(nums, key));
    }
}
