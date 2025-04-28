class Solution {
   public int longestOnes(int[] nums, int k) {
       int left = 0;
       int right = 0;
       int nulls = 0;
       int count = -1;

       while (right<nums.length){
           if(nums[right]==0){
               nulls++;
           }
           if (nulls>k){
               while(nums[left]==1){
                   left++;
               }
               left++;
               nulls--;
           }

           count = Math.max(count, right-left+1);
           right++;
       }
       return count;
   }
}