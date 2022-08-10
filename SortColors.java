class Solution {

    /*
     * Time - O(n)
     * Space - O(1)
     */
    public void sortColors(int[] nums) {
        
        // Keep 3 pointers, low, mid, high where low is for 0, mid is for 1 and high is for 2
        // when mid is 0, swap mid and low and inc. both ahead
        // when mid is 1, move mid ahead
        // when mid is 2, swap mid and high and dec. high
        // We don't inc. mid when mid is 2 because the swapped element at mid now could
        // be either 0 or 1, so we need to check that again.
        // while condition is mid<=high because high is dec. and mid is inc. 
        // they will overlap
        int low =0, mid=0, high = nums.length-1;
        while (mid<=high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) 
                mid++;
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}