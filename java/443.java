public class Solution {
   public int compress(char[] chars) {
       int i = 0;
       int total = 0;
       int n = chars.length;
       if (n == 1){
           return 1;
       }
       while (i<n){
           int len = 1;
           char cur = chars[i];
           while (i+1<=n-1 && chars[i] == chars[i+1]){
               len++;
               i++;
           }
           chars[total++] = cur;
           if (len>1){
               String lenstr = Integer.toString(len);
               for(int m=0;m<lenstr.length();m++){
                   chars[total++] = lenstr.charAt(m);
               }
           }
           i++;
           
       }
       return total;
   }
}
