import java.util.*;

public class MajorityElement {

    public static void main(String args[]){
        int arr[] = {1,3,2,5,1,3,1,5,1};
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        Set<Integer> keySet = map.keySet();
        for (int key : keySet) {
            if(map.get(key) > (arr.length/3)){
            System.out.print(key);
            }
        }
    }
}


/*
 * class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Integer maps : map.keySet()){
            if(map.get(maps) > (nums.length)/2){
                return maps;
            }
        }
        return -1;
    }
}
 */