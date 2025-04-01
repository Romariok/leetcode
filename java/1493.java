class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int right;
        int zeros=0;
        int total = 0;

        for (right = 0;right<nums.length;right++){
            if (nums[right]==0){
                zeros++;
            }
            while(zeros>1){
                if (nums[left]==0){
                    zeros--;
                }
                left++;
            }
            total=Math.max(right-left, total);
        }
        return total;
    }
}