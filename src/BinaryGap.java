import java.util.*;
class Solution1 {
    public int solution(int N) {
        if(N <= 4 || N == 2147483647) return 0;

        char[] aux = Integer.toBinaryString(N).toCharArray();
        int i = 0, j = aux.length-1;
      
        while(j>i  && aux[j] =='0' ){
            j--;
            if(j==i+1)return 0;
        }
        int res = 0;
        int cur = 0;
        for (int k = i+1; k < j; k++) {
            if(aux[k] == '1'){
                cur = 0;
            }else{
                cur +=1;
            }
            res = Math.max(res, cur);
        }
        
        
        return res;
    }
}

public class BinaryGap {
    public static void main(String[] args) {
        
    }
}
