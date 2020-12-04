// Time - O(N)
// Space - O(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int mid = 0, low = 0, high = nums.length - 1;
        int tmp;
        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(mid, low, nums);
                low++;
                mid++;
            }
            else if(nums[mid] == 2) {
                swap(mid, high, nums);
                high--;
            }
            else {
                mid++;
            }
        }
    }
    
    private void swap(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
