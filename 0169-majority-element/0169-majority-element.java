class Solution {
    public int majorityElement(int[] nums) {
        int m_ele = 0;
        int max_time = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.get(num) > max_time){
                m_ele = num;
                max_time = map.get(num);
            }
        }
        return m_ele;
    }
}