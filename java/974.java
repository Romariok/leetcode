class Solution {
   public int subarraysDivByK(int[] nums, int k) {
       int sum = 0;
       int result = 0;
       int[] count = new int[k];
       count[0] = 1;

       for(int num: nums){
           sum +=num;

           int mod = sum % k;
           if (mod < 0) mod+=k;

           result += count[mod];
           count[mod] = count[mod]+1;
       }

       return result;
   }
}