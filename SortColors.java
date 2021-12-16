/**
 Time complexity: O(n)
 Space complexity: O(1)
 Appraoch is to keep 3 pointers
 */
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int low = 0, mid = 0, high = nums.length - 1;

        //till mid is less than or equal to high
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                //low and mid shld be increment
                low++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, high);
                //no need to chnage mid as we will go ahead
                high--;
            } else {
                mid++;
            }
        }
    }

    public void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}