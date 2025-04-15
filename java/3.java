class Solution {
   public int lengthOfLongestSubstring(String s) {
       int start = 0;
       int end = 0;
       int maxLen = 0;
   
       HashSet<Character> dub = new HashSet<Character>();

       char[] charArray = s.toCharArray();

       while(end<charArray.length){
           if (!dub.contains(charArray[end])){
               dub.add(charArray[end]);
           }
           else{
               while(charArray[start] != charArray[end]){
                   dub.remove(charArray[start]);
                   start++;
               }
               start++;
           }

           maxLen = Math.max(maxLen, end-start+1);
           end++;
       }

       return maxLen;

   }
}