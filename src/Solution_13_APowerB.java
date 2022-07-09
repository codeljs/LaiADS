public class Solution_13_APowerB {
    //https://app.laicode.io/app/problem/13?plan=3
    public long power(int a, int b) {

        if(b == 0)return 1;
        long halfRes =  power(a, b/2);
        return (b%2==0)?(halfRes*halfRes) : (halfRes*halfRes*a);

    }


}
