public class Solution_624_Fibo {
    //https://app.laicode.io/app/problem/624?plan=3

        public int fibonacci(int K) {
            // Write your solution here
            if(K <= 0) return 0;
            if(K == 1) return 1;
            return fibonacci(K-1)+fibonacci(K-2);
        }

}
