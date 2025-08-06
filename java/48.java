class Solution {
   public void rotate(int[][] matrix) {
       int n = matrix.length;
       if (n !=1){
           for(int i=0;i<Math.floor(n/2);i++){
               int end = n-i-1;
               for(int j=i;j<end;j++){
                   int tmp = matrix[j][end];
                   matrix[j][end] = matrix[i][j];
                   int tmp1 = matrix[end][end-(j-i)];
                   matrix[end][end-(j-i)] = tmp;
                   matrix[i][j] = matrix[end-(j-i)][i];
                   matrix[end-(j-i)][i] = tmp1;
               }
               
           }
       }

       return;
   }
}