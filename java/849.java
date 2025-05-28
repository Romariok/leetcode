class Solution {
   public int maxDistToClosest(int[] seats) {
       int start = 0;
       int result = 0;
       int tmp = 0;
       int n = seats.length;

       for(int i = 0; i < n; i++){
           if(seats[i] == 0 && i != n-1) tmp++;
           else{
               if (seats[i] == 0) tmp++;
               int max;
               if (start == 0 || (i == n-1 && seats[i]==0))max = tmp;
               else{
                   if(tmp % 2 != 0) max = (int) Math.ceil((double) tmp /2);
                   else  max = tmp /2 ;
               }
               
               tmp = 0;
               start = i+1;
               result = Math.max(result, max);
           }
       }

       return result;
   }
}