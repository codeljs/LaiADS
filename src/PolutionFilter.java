import java.util.*;
class Solution2{
    public int solution(int[] A){
        int res = 0;
        double sum = 0;
        Queue<Double> queue = new PriorityQueue<Double>((a,b)->{
            if(a.equals(b))return 0;
            return (a>b)? -1:1;
        });
        for (int i = 0; i < A.length; i++) {
            sum+= A[i];
            queue.offer((double)A[i]);
        }
        double target = sum/2;
        
        while(sum > target){
            double temp = queue.poll();
            temp /= 2;
            sum -= temp;
            queue.offer(temp);
            res++;
        }
        return res;
    }


        // 第二题，x[i]/y[i] + x[j]/y[i] = 1的pair数，对1e9+7取模
    // 思路：map
    public int solution(int[] X, int[] Y) {
        // write your code in Java 8 (Java SE 8)
        int mod = (int) (1e9 + 7);
        int n = X.length;
        long res = 0;
        Map<Integer, Map<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int gcg = gcd(X[i], Y[i]);
            int up = X[i] / gcg;
            int down = Y[i] / gcg;
            Map<Integer, Integer> curMap = map.computeIfAbsent(down, k -> new HashMap<>());
            res = (res + curMap.getOrDefault(down - up, 0)) % mod;
            curMap.put(up, curMap.getOrDefault(up, 0) + 1);
        }
        return (int) res;
    }

    public int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // public int solution(int[] A, int x, int y){
    //     int res = Integer.MAX_VALUE;
    //     for (int i = 0; i <= A.length-1 - y*(x-1); i++) {
    //         int sum = 0;
    //         for(int j = 0;j<x;j++){
    //             sum += A[i+j*y];
    //         }
    //         res = Math.min(res, sum);
    //     }

    //     return res;
    // }
        // 第三题，数组A中每间隔Y-1个的连续X个数的最小和
    // 思路：滑动窗口
    public int solution(int[] A, int X, int Y) {
        // write your code in Java 8 (Java SE 8)
        int n = A.length;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < Y; i++) {
            int left = i, right = i;
            int sum = 0;
            int count = 0;
            while (right < n) {
                sum += A[right];
                right += Y;
                count++;
                while (count == X) {
                    res = Math.min(res, sum);
                    sum -= A[left];
                    left += Y;
                    count--;
                }
            }
        }
        return res;
    }
}
public class PolutionFilter {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        int[] A = new int[]{1,2,4,8,10,3};
        int res = s.solution(A,2,3);
        System.out.println(res);
        
       
    
   
}}
