public class Solution_9_MergeSort {
    //https://app.laicode.io/app/problem/9?plan=3
    public int[] mergeSort(int[] array) {
        //corner case
        if(array == null || array.length<=1)return array;
        int[] helper = new int[array.length];
        sort(array,helper,0,array.length-1);
        return array;
    }

    private void sort(int[] array, int[] helper, int left, int right){
        //corner case
        if(left == right )return;
        int mid = left + (right-left)/2;

        sort(array, helper, left,mid);
        sort(array, helper,mid+1, right);
        merge(array, helper,left,mid,right );


    }

    private void merge(int[] array, int[] helper, int left, int mid, int right){
        for(int i=left;i<=right;i++){
            helper[i]= array[i];
        }
        int index = left, leftIndex = left, rightIndex = mid+1;
        while (leftIndex<=mid && rightIndex<=right){
            if(helper[leftIndex]<=helper[rightIndex]){
                array[index++] = helper[leftIndex++];
            }else{
                array[index++] = helper[rightIndex++];
            }
        }
        //only cares about left part, because if there are few numbers in the right, they're already in the right order.
        while(leftIndex<=mid){
            array[index++] = helper[leftIndex++];
        }


    }
}
