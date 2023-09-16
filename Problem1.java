// Time Complexity : O(n) as it will traverse all elements in nums swap takes constant time
// Space Complexity : O(1) as we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Problem1 {
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            }else if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            }else{
                mid++;
            }
        }
    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
