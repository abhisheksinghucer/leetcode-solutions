class Solution {
    public int minStartValue(int[] nums) {
        int[] prefix = new int[nums.length + 1];
        int min = 0;
        int pre = 0;
        for(int i = 0; i < nums.length; i++){
            int next = pre + nums[i];
            if(next < min){ min = next;}
            pre = next;
        }
        return 1 - min;
    }
}