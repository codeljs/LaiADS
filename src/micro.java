import java.util.*;

import javax.naming.ldap.SortControl;

class Solution3{
    public int solution(int[] X, int[] Y, int W) {
        // write your code in Java 8 (Java SE 8)
        Arrays.sort(X);
        int res = 0;
        int cur = X[0];
        int limit = X[X.length-1];
        for (int i = 0; i < X.length ; ) {
            res++;
            cur+= W;
            if(cur >= limit)break;
            System.out.println(cur);
            while(i < X.length&& X[i]<= cur){
                i++;
                
            }
            if(i<X.length){
                cur = X[i];
            }
         
        }

        return res;
    }

    public int solution(int[] A, int[] B) {
        // write your code in Java 8 (Java SE 8)
        int[] C  = new int[A.length];
        int[] aux = new int[100010];
        int n = A.length;
        for (int i = 0; i < n; i++) {
            C[i] = (A[i]>B[i])?A[i]:B[i];
            aux[C[i]] = 1;
        }

        for (int i = 1; i < aux.length; i++) {
            if(aux[i] == 0)return i;
        }
        return n;
    }

    public int solution(int[] A, int M) {
        // write your code in Java 8 (Java SE 8)
        int n = A.length;
        int fact = 1000000000;
        fact = M- fact%M + fact;
        if(M == 1 )return n;
        int[] aux = new int [M]; 
        int res = 1;
        for (int i = 0; i < n; i++) {
            int cur = (fact + A[i])%M;
            aux[cur] += 1;
            res  = Math.max(aux[cur], res);
        }
        return res;
    }

    public int solution(String S) {
        // write your code in Java 8 (Java SE 8)
        int N = S.length();
        HashMap<Integer,Integer> ind = new HashMap<>();
        int mask = 0;
        ind.put(0,-1);
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int val = S.charAt(i) - 'a';
            val = 1<<val;
            mask ^= val;
            if(ind.containsKey(mask)){
                ans = Math.max(ans, i-ind.get(mask));
            }
            else{
                ind.put(mask,i);
            }
        }
        return ans;
    }



}


public class micro {
    public static void main(String[] args) {
        int[] X = {3,3,4};
        int[] Y = {20,30,40};
        int[] A = {-3,-2,1,0,8,7,1};
        int[] B = {7,1,11,8,-100000,100000,1000000000};
        
        Solution3 s = new Solution3();
        int res = s.solution(B,100000);
        // System.out.println(res);


        res = s.solution("bbcabab");
        System.out.println(res);
        System.out.println('a'-0);

    }
}
