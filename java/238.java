class Solution {
   public int[] productExceptSelf(int[] nums) {
       int[] result = new int[nums.length];

       if(nums.length == 2){
           result[0] = nums[1];
           result[1] = nums[0];
           return result;
       }

       int leftProduct = nums[0];
       result[nums.length-1] = nums[nums.length-1];
       for(int i = nums.length-2;i>0;i--){
           result[i] = nums[i]*result[i+1];            
       }
       result[0] = result[1];

       for(int i = 1;i<result.length-1;i++){
           result[i] = leftProduct*result[i+1];
           leftProduct*=nums[i];            
       }
       result[result.length-1] = leftProduct;

       return result; 

   }
}