class Solution {
   public:
       bool isSubsequence(string s, string t) {
           if(s.empty()) return true;
           long i = 0;
           for(char c: t){
               if(c == s[i]){
                   i++;
                   if(i==s.size()) return true;
               }
           }
           if(i==s.size()) return true;
           return false;
       }
   };