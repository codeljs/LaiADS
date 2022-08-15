public class Solution_9_MergeSort {
    //https://app.laicode.io/app/problem/9?plan=3
    // public int[] mergeSort(int[] array) {
    //     //corner case
    //     if(array == null || array.length<=1)return array;
    //     int[] helper = new int[array.length];
    //     sort(array,helper,0,array.length-1);
    //     return array;
    // }

    // private void sort(int[] array, int[] helper, int left, int right){
    //     //corner case
    //     if(left == right )return;
    //     int mid = left + (right-left)/2;

    //     sort(array, helper, left,mid);
    //     sort(array, helper,mid+1, right);
    //     merge(array, helper,left,mid,right );


    // }

    // private void merge(int[] array, int[] helper, int left, int mid, int right){
    //     for(int i=left;i<=right;i++){
    //         helper[i] = array[i];
    //     }
    //     int index = left, leftIndex = left, rightIndex = mid+1;
    //     while (leftIndex<=mid && rightIndex<=right){
    //         if(helper[leftIndex]<=helper[rightIndex]){
    //             array[index++] = helper[leftIndex++];
    //         }else{
    //             array[index++] = helper[rightIndex++];
    //         }
    //     }
    //     //only cares about left part, because if there are few numbers in the right, they're already in the right order.
    //     while(leftIndex<=mid){
    //         array[index++] = helper[leftIndex++];
    //     }


    // }


    public int[] mergeSort(int[] array){
        int[] aux = new int[array.length];
        sort(array,aux,0,array.length-1);
        return array;
    }

    public void sort(int[] a, int[] aux, int lo,int hi){
        if(hi <= lo)return;
        int mid = lo+(hi-lo)/2; // pay attention!
        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        merge(a,aux, lo,mid,hi);
        
    }

    public void merge(int[] a, int[] aux,int lo, int mid, int hi){
        for(int i = lo; i <= hi; i++){
            aux[i] = a[i];
        }
        // set two pointers
        int j = lo;
        int k = mid+1;
        for(int i = lo; i <= hi; i++){
            if(j > mid) a[i] = aux[k++];
            else if(k > hi) a[i] = aux[j++];
            else if(aux[j] <= aux[k])a[i] = aux[j++];
            else a[i] = aux[k++];
        }
        return;
    }

    public static void main(String[] args){
        int[] array = new int[]{5,4,3,2,1};
        Solution_9_MergeSort s = new Solution_9_MergeSort();
        s.mergeSort(array);
        for(int i = 0 ; i < array.length; i++){
            System.out.print(array[i]);
        }
    }

    




}
