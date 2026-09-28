class Solution {
    public int maxDepth(String s) {
        int max_count = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(') {
                count++;
            } else if(ch == ')'){
                count--;
            }
            if(max_count < count){
                max_count = count;
            }
        }
        return max_count;
    }
}