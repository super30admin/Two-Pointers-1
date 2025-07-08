// Time Complexity: O(n) // because we have to vist each and every element 
// Space Complexity: O(1) // in place swapping

// We use 3 pointers, each to denote the starting position of 0, 1, 2. We correctly place the mid elements in either left or right and update the pointers appropriately

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length-1;

        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(mid, high, nums);
                high--;
            } else if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            } else {
                mid++;
            }
            
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
