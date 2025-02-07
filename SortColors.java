// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {

        //0 - red, 1 - white, 2 - blue
        //we need to sort them in place:- Dutch Flag Algorithm

        int n = nums.length;

        int left = 0;
        int right = n - 1;
        int mid = 0;

        while(mid <= right) {

            if(nums[mid] == 2) {

                swap(nums, mid, right);
                right--;
            }
            else if(nums[mid] == 0) {

                swap(nums, left, mid);
                left++;
                mid++;
            }
            else {
                //nums[mid] == 1
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