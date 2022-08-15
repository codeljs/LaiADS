import java.util.HashSet;

public class Lc41firstMissingPositive {
    // https://leetcode.cn/problems/first-missing-positive/
    public int firstMissingPositive(int[] nums) {
        int len = nums.length;
        for(int i = 0; i < len;i++){
            while(nums[i]-1>=0 &&nums[i]-1<len&&nums[nums[i]-1]!=nums[i]){
                swap(nums, i, nums[i]-1);
            }
        }
        for(int i = 0; i<len;i++){
            if(nums[i] != i+1 )return i+1;
        }
        return nums.length+1;
        

    }
    void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp; 
        String s = new String();

        
    }
}
