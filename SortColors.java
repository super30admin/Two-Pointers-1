// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Approach: Brute force - Nested iterations which will be O(n^2)
// USing 3 pointer approach we can reduce time complexity to O(n)
class SortColors {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int low =0;
        int high = n-1;

        int curr =0;

        while(curr <= high) {
            if(nums[curr] == 2) {
                swap(nums, curr, high);
                high--;
            }else if(nums[curr] == 0) {
                swap(nums, low, curr);
                curr++;
                low++;
            }else{
                curr++;
            }
        }
    }

    public void swap(int nums[], int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;
    }
}