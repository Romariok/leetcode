class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> result = new ArrayList<String>();
        if (nums.length==0){
            return result;
        }
        Integer start = nums[0];
        
        for (int i=1;i<nums.length;i++){
            if (nums[i]-1!=nums[i-1]){
                if (nums[i-1]==start){
                    result.add(""+start);
                }
                else{
                    result.add(start + "->" +nums[i-1]);
                }
                start = nums[i];
            }
        }
        if (nums[nums.length-1]==start){
            result.add(""+start);
        }
        else{
            result.add(start + "->" +nums[nums.length-1]);
        }


        return result;
    }
}