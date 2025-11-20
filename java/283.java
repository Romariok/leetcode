class Solution {
   public void moveZeroes(int[] nums) {
       int count = 0;
       for (int i = 0; i<nums.length;i++){
           if (nums[i]==0){
               count++;
               continue;
           }
           else{
               if(count == 0) continue;
               nums[i-count] = nums[i];
               nums[i] = 0;
           }
       }
       return;
   }
}