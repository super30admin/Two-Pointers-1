// Time complexity - O(n)
// Space complexity - O(1)

// 3 pointers approach - left, mid and high. If mid == 0 swap with left and increase left, if mid == 1 increase mid and if mid == 2 swap with high and decrease high.


class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high){
            if (nums[mid] == 1)
                mid++;
            else if (nums[mid] == 0)
                swap(nums, low++, mid++);
        else
            swap(nums, mid, high--);
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
