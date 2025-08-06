class Solution {
   public String longestPalindrome(String s) {
       String maxS = s.substring(0,1);
       for(int i=0;i<s.length()-1;i++){
           String odd = expandCenter(s,i,i);
           String even = expandCenter(s,i,i+1);

           if(odd.length()>maxS.length()){
               maxS = odd;
           }
           if(even.length()>maxS.length()){
               maxS = even;
           }
       }
       return maxS;
   }

   public String expandCenter(String s, int l, int r){
       while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
           l--;
           r++;
       }
       return s.substring(l+1,r);
   }
}