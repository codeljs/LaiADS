public class Solution_106_LongestSubMatrixSum {
    public int largest(int[][] matrix) {
        // Write your solution here
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] preSum1D = new int[n][m]; 

        int res = matrix[0][0];

        for (int j = 0; j < m; j++) {
            int cur = 0;
            for (int i = 0; i < n; i++) {
                cur += matrix[i][j];
                preSum1D[i][j] = cur;
            }
        }

        for (int c1 = 0; c1 < n; c1++) {
            for (int c2 = c1; c2 < n; c2++) {
                
                int compress2D[] = new int[m];
                for(int j = 0 ;j<m;j++){
                    compress2D[j] = preSum1D[c2][j]-preSum1D[c1][j]+matrix[c1][j];
                   
                }
                int cur = LargestSumofSubArray(compress2D);
                res = Math.max(res, cur);
            }
        }
    
        return res;
      }

      static int LargestPreSumofSubArray(int[] array){
        int res = array[0];
        int cur = 0;
        for (int i = 1; i < array.length; i++) {
            if(array[i-1]<=0)cur = array[i] - array[i-1];
            else{
                cur = cur + array[i]-array[i-1]; 
            }
            res = Math.max(res,cur);
        }

        return res;
      }

      static int LargestSumofSubArray(int[] array){
        int res = array[0];
        int pre = array[0];
        for (int i = 1; i < array.length; i++) {
            if(pre<=0)pre = array[i];
            else{
                pre += array[i]; 
            }
            res = Math.max(res,pre);
        }

        return res;
      }
}
