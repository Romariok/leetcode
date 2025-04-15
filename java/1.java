class Solution {
   public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> dif = new HashMap<Integer, Integer>();

       for(int i = 0; i<nums.length;i++){
           int diff = target-nums[i];

           if(dif.containsKey(diff))
               return new int[]{dif.get(diff), i};
           dif.put(nums[i], i);
       }
       return new int[]{};
   }
}