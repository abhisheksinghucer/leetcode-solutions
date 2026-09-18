class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int prev = nums[0];
        int p = 1;
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != prev){
                count++;
                nums[p] = nums[i];
                p++;
                prev = nums[i];
            }
        }
        return count;
    }
}