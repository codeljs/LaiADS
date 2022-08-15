public class Solution_4_SelectionSort {
    //https://app.laicode.io/app/problem/4?plan=3
    public int[] solve(int[] array) {
        //corner case
        if(array == null || array.length<=1)return array;

        for(int i =0;i< array.length; i++){
            int min = i;
            for(int j = i; j<array.length;j++){
                if(array[j] < array[min])min = j;
            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        return array;


    }
}
