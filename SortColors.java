// Time Complexity : O(N) , N is the length of input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :
class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, high = n-1; //low pointer for 0's, mid pointer for 1's and high pointer for 2's
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
        
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}