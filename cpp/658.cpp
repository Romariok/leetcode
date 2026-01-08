class Solution {
   public:
       vector<int> findClosestElements(vector<int>& arr, int k, int x) {
           int l = 0;
           int r = arr.size() - 1;
   
           while(r-l+1>k){
               if(abs(arr[l] - x) < abs(arr[r] - x)){
                   r--;
               }
               else if(abs(arr[l] - x) == abs(arr[r] - x) && arr[l] < arr[r]){
                   r--;
               }
               else{
                   l++;
               }
           }
   
           vector<int> result;
           for(int i = l;i<=r;i++){
               result.push_back(arr[i]);
           }
   
           return result;
       }
   };