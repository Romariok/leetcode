class Solution {
   public int[][] generateMatrix(int n) {
       int[][] target = new int[n][n];
       int num = 1;
       int left = 0;
       int right = n-1;
       int top = 0;
       int bottom = n-1;

       while(top<=bottom && left<=right){
           for (int i =left;i<=right;i++){
               target[top][i] = num++;
           }
           top++;
           for (int i =top;i<=bottom;i++){
               target[i][right] = num++;
           }
           right--;
           if (top <= bottom) {
               for (int i = right; i >= left; i--) {
                   target[bottom][i] = num++;
               }
               bottom--;
           }
           if (left <= right) {
               for (int i = bottom; i >= top; i--) {
                   target[i][left] = num++;
               }
               left++;
           }
       }
       return target;
   }

}