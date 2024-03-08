//time: O(N) where N is size of the array
//space: O(1)
//approach: Use 3 pointers low mid and high. It on the mid we encounter 0 swap it with low else if we encounter 2 swap it with high and increment decrement pointers accordingly.

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n -1;
        int mid = 0;
        while (mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++; mid++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if(nums[mid] == 1) {
                mid++;
            }
        }

    }
    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
