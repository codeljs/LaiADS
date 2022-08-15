import java.util.*;
class Solution{

    //merge  input int[] output int[]
    int[] mergeSort(int[] array){
        if(array == null || array.length == 0||array.length == 1)return array;
        int[] aux = new int[array.length];
        merge(array,aux,0,array.length-1);
        return array;
    }

    void merge(int[] array,int[] aux,int left,int right){
        if(left>=right)return;
        int mid = (left+right)/2;
        merge(array,aux,left,mid);
        merge(array,aux,mid+1,right);
        for(int i = 0;i<right-left;i++){
            aux[left+i] = array[left+i];
        }
        int l1 = left;
        int l2 = mid+1;
        int cur = left;
        while(l1<mid+1&&l2<=right){
            if(l1<=l2){
                array[cur++] = aux[ l1++ ];
            }
            else{
                array[cur++] = aux[l2++];
            }
        }
        while(l1<mid+1){
            array[cur++] = aux[l1++];
        }
    }

    public static void main(String[] args) {
      
    }
}