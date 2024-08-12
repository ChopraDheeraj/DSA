class Solution {
    public int missingNumber(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[0]!=0){
            return 0;
        }
        if(n==1){
            if(nums[0]==0){
                return 1;
            }          
        }
        int i = 0;
        for(int j=1; j<n; j++){
            if(nums[j] - nums[i] == 1){
                i++;
            }
            else{
                return i+1;
            }
        }
        return i+1;
    }
}