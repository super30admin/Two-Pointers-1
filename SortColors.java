// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
public class SortColors {
    public void sortColors(int[] nums) {

        int start = 0;
        int current = 0;
        int end = nums.length - 1;

        while(current <= end) {
            if(nums[current] == 0) {
                int temp = nums[current];
                nums[current] = nums[start];
                nums[start] = temp;
                current+=1;
                start+=1;
            } else if(nums[current] == 2) {
                int temp = nums[current];
                nums[current] = nums[end];
                nums[end] = temp;
                end-=1;
            } else{
                current+=1;
            }
        }

    }
}
