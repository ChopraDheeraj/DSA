class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        k = k % n;
        int rotated[] = new int[n];
        for(int i=0; i<nums.length; i++){
        rotated[(i + k) % n]= nums[(i)];
        }
        //to copy rotated array to nums because void return
        for(int i=0; i<nums.length; i++){
            nums[i] = rotated[i];
        }
    }
}