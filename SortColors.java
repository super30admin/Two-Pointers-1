package S30.TwoPointers_1;

/*
Time Complexity : Put: O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : None
*/

public class SortColors {

    public void sortColors(int[] nums) {

        if(nums.length == 0 || nums == null) return;

        int zeroPtr = 0;
        int twoPtr = nums.length - 1;

        for(int i = zeroPtr; i <= twoPtr;){

            if(nums[i] == 2){
                swap(twoPtr,i,nums);
                twoPtr--;
            } else if(nums[i] == 0) {
                swap(zeroPtr,i,nums);
                zeroPtr++;
                i++;

            }else i++;

        }

    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
