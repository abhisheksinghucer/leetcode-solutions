class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int temp = 0;
        for(int i=0; i<nums.length; i++){
            temp += nums[i]; 
            if(i>0 && (temp%k == 0 || temp==0)){
                return true;
            }
            int remainder = temp%k;
            if (map.containsKey(remainder)) {

                int previousIndex = map.get(remainder);

                if (i - previousIndex >= 2) {
                    return true;
                }

            } else {
                // Store only the first occurrence
                map.put(remainder, i);
            }
        }
        return false;
        

    }
}