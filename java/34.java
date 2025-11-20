class Solution {

   public int bSearch(int[] nums, int target, boolean isLeftSearching){
       int left = 0;
       int right = nums.length-1;
       int idx=-1;

       while (left <= right) {
           int mid = left + (right-left)/2;

           if (nums[mid] < target){
               left = mid+1;
           }
           else if (nums[mid] > target){
               right = mid-1;
           } else{
               idx = mid;
               if (isLeftSearching){
                   right = mid-1;
               }
               else{
                   left = mid+1;
               }

           }
       }
       return idx;
   }

   public int[] searchRange(int[] nums, int target) {
       int left = bSearch(nums, target, true);
       int right = bSearch(nums, target, false);
       int[] result = {-1, -1};
       result[0] = left;
       result[1] = right;
       return result;  
   }
}