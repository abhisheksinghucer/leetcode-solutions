class Solution {

    public void update_answer(int[] answer, int[] nums, int product) {
        for(int i = 0; i < nums.length; i++){
            answer[i] = product / nums[i];
        }
    }

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int zero_count = 0;
        int zero_idx = -1;
        int product = 1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                if(zero_count == 1) {
                    return new int[nums.length];
                }
                zero_idx = i;
                zero_count++;
                continue;
            }
            product *= nums[i];
        }
        if(zero_count == 1) {
            answer[zero_idx] = product;
        } else {
            update_answer(answer, nums, product);
        }
        return answer;
    }
}