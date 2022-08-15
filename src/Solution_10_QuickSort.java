public class Solution_10_QuickSort {
    //https://app.laicode.io/app/problem/10?plan=3
    public int[] quickSort(int[] array) {
        //corner case
        if(array == null || array.length<=1)return array;
        sort(array, 0, array.length-1);
        return array;
    }

    private void sort(int[] array, int left, int right){
        //corner case
        if(left >= right)return;
        //pivot   
        int position = pivot(array,left,right);
        sort(array,left,position-1);
        sort(array,position+1,right);
    }

    private int pivot(int[] array, int left,int right){
        int i = left, j = right-1;
        while(i<=j){
            if(array[i]< array[right]){
                i++;
            }else {
                swap(array,i,j--);
            }
        }
        swap(array, i, right);
        return i;
    }

    private void swap(int[] array, int i,int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
