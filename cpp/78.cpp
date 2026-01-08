class Solution {
   public:
       vector<vector<int>> subsets(vector<int>& nums) {
           vector<vector<int>> result; 
           if (nums.empty()) {
               return result; 
           }
   
           vector<int> cur; 
           dfs(nums, cur, 0, result);
           return result;
       }
   
       void dfs(vector<int>& nums, vector<int>& cur, int startIndex, vector<vector<int>>& result) {
           result.push_back(cur);
           for (int i = startIndex; i < nums.size(); i++) {
               cur.push_back(nums[i]);
               dfs(nums, cur, i + 1, result);
               cur.pop_back();
           } 
       }
   };