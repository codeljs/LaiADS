// public class Solution1 {
//         public int totalNumber(int[][] matrix,int n ){
//             int[] result = new int[]{0};
//             int index = 0;
//             int level = 0;
//             int[] temp = new int[3];
//             for (int i = 0; i < temp.length; i++) {
//                 temp[i] = -1;
//             }
//             DFS(matrix,result,level ,index,temp);

//             return result[0];
//         }

//         public void DFS(int[][] matrix, int[] result, int level, int index, int[] temp){
//             //corner case: level == 3
//             if(level == 3){
//                 if(check(temp, matrix)) result[0]++;
//             }
//             else{
                
//             for (int i = index; i < matrix.length; i++) {
//                 temp[level] = i;
//                 DFS(matrix, result, level+1, i+1, temp);
//                 temp[level] = -1;
//                 }
//             }

//         }

//         public boolean check(int[] temp, int [][] matrix){
//             for (int i = 0; i < 3; i++) {
//                 for (int j = i; j < 3; j++) {
//                     if(matrix[temp[i]][j] != matrix[temp[j]][i])return false;
//                 }
//             }
//             return true;
//         }






//     public static void main(String[] args) {
//         int[][] matrix = new int[4][3];
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 matrix[i][j] = 1;
//             }
//         }
//         for (int i = 0; i < 3; i++) {
//             matrix[3][i] = 0;
//         }

//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix[0].length; j++) {
//                 System.out.print(matrix[i][j]);
//             }
//             System.out.println();
//         }

//         Solution1 s = new Solution1();
//         System.out.println(s.totalNumber(matrix, 4));
//     }

// }
