// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No

/**
 * Use the three pointer approach, use low, mid=low, high in the end. Iterate over the array until mid <= high, if element is 2, then swap mid and high. This will help you to
 * move all 2's in the end. if element is 0, then swap mid and low. This will help you to move all 0's in the start. This way 1 will take care of itself automatically.
 * Its mid <= high, not low <= high because when this condition fails, mid has already gone past all 1's which means 0's & 1's are in order. Hence, 2's are also in order.
 */

class Solution {
    public void sortColors(int[] nums) {

        int low = 0, high = nums.length-1, mid = low;

        while(mid <= high) {

            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int mid, int index) {
        int temp = nums[mid];
        nums[mid] = nums[index];
        nums[index] = temp;
    }
}


/*
// Time Complexity : O(N)
// Space Complexity : O(1)

class Solution {
    public void sortColors(int[] nums) {

        int oneC=0, twoC=0, zeroC=0;

        for(int n: nums) {
            if(n == 0) zeroC++;
            else if(n == 1) oneC++;
            else twoC++;
        }

        for(int i=0; i<zeroC; i++)
            nums[i] = 0;

        for(int i=zeroC; i<(zeroC+oneC); i++)
            nums[i] = 1;

        for(int i=(zeroC+oneC); i<nums.length; i++)
            nums[i] = 2;
    }
}*/
