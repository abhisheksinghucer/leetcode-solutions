class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int rotation_idx = 0;
        if(k < len){
            rotation_idx = len - k;
        } else if(k > len){
            k %= len;
            rotation_idx = len - k;
        } 
        if(rotation_idx == len || k == len){
            return;
        }

        int[] temp = new int[len];
        int t = 0;
        for(int i = rotation_idx; i<len; i++){
            temp[t] = nums[i];
            t++;
        }
        for(int i = 0; i<rotation_idx; i++){
            temp[t] = nums[i];
            t++;
        }

        for(int i=0; i< len; i++){
            nums[i]= temp[i];
        }
    }
}