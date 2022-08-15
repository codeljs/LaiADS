import java.util.Scanner;

public class tt {
    public static void main(String[] args) {
        int[] aux = new int[]{1,-3,-9,5,19,-4};
        for (int j = 0; j < aux.length; j++) {
            System.out.print(aux[j]);
        }
        int res = LargestSumofSubArray(aux);
        System.out.println();
        System.out.println(res);
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
