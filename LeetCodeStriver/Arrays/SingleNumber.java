//Given a non-empty array of integers nums, every element appears twice except for one.
// Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) == 1){
                return key;
            }
        }
        return -1;
    }
}
