class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (a, b) -> {if (a.length() > b.length()) {
        return 1;
    }

    if (a.length() < b.length()) {
        return -1;
    }

    return a.compareTo(b);
        });
        return nums[nums.length - k];
    }
}