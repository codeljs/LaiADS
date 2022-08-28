import java.util.Arrays;

public class Solution_115_ArrayDedplication1 {
    public static void main(String[] args) {
        
    }
}

class Solution115{
    public int[] dedup(int[] array) {
        // Write your solution here
        if(array == null|| array.length <=1)return array;
        int slow = 1;
        int fast = 1;

        for (; fast < array.length; fast++) {
            if (array[fast] == array[slow-1]) {
                continue;
            } else {
                array[slow++] = array[fast];
            }
        }


        return Arrays.copyOfRange(array, 0, slow);
      }
}     
class Solution116{
    public int[] dedup(int[] array) {
        // Write your solution here
        if(array == null|| array.length <=1)return array;
        int slow = 2;
        int fast = 2;

        for (; fast < array.length; fast++) {
            if (array[fast] == array[slow-2]) {
                continue;
            } else {
                array[slow++] = array[fast];
            }
        }


        return Arrays.copyOfRange(array, 0, slow);
    }
}

class Solution117{
    public int[] dedup(int[] array) {
        // Write your solution here
        if(array == null|| array.length <=1)return array;
        int slow = 0;
        int fast = 0;
        boolean flag = false; // to record current element in the array[slow] is repeated or not
        while(fast<array.length){
            int fast2 = fast;
            while(fast2<array.length && array[fast2] == array[fast]){
                fast2++;
            }
            if(fast2 == fast +1){
                array[slow++] = array[fast];
            }
            fast = fast2;
        }
        return Arrays.copyOfRange(array, 0, slow);
    }


    public int[] moveZero(int[] array) {
        // Write your solution here
        if(array == null|| array.length <=1)return array;
        int slow = 0;
        int fast = 0;
        for (; fast < array.length; fast++) {
            if(array[fast] != 0){
                array[slow++] = array[fast];
            }else{
                continue;
            }
        }
        for (int i = slow; i < array.length; i++) {
            array[i] = 0;
        }
        return array;
    }
}
