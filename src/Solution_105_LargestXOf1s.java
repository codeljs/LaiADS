public class Solution_105_LargestXOf1s {
    public int largest(int[][] matrix) {
        // Write your solution here
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] LR = new int[n+m][n+m]; 
        int[][] RL = new int[n+m][n+m]; 
        int[][] UD = new int[n+m][n+m]; 
        int[][] DU = new int[n+m][n+m]; 
        int res = 0;

        


        for(int i = 0; i < n;i++){
            for (int j = 0; j < m; j++) {
                if(j == 0||i == 0){
                    LR[i][j] = matrix[i][j];
                    RL[n-i-1][m-j-1] = matrix[n-i-1][m-j-1];
                }
                else{
                    LR[i][j] = matrix[i][j] == 0?0:LR[i-1][j-1] + 1;
                    RL[n-i-1][m-j-1] = matrix[n-i-1][m-j-1] == 0?0:RL[n-i][m-j]+1;
                }
            }
        }
        for(int j = 0; j < m;j++){
            for (int i = 0; i < n; i++) {
                if(i == n-1 || j==0){
                    UD[i][j] = matrix[i][j];
                    DU[n-i-1][m-j-1] = matrix[n-i-1][m-j-1];
                }
                else{
                    UD[i][j] = matrix[i][j] == 0?0:UD[i+1][j-1]+1;
                    DU[n-i-1][m-j-1] = matrix[n-i-1][m-j-1] == 0?0:DU[n-i-2][m-j]+1;
                }
            }
        }

        for(int i = 0; i < n;i++){
            for (int j = 0; j < m; j++) {
                int cur = myMin(LR[i][j], RL[i][j], UD[i][j], DU[i][j]);
                res = Math.max(res, cur); 
            }
        }
        return res;
      }

      int myMin(int a, int b, int c, int d){
        int temp = Math.min(a,b);
        temp = Math.min(temp, c);
        temp = Math.min(temp, d);
        return temp;
      }
}
