// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// specific example of 3 pointers
public class sortColors {
    class Solution {
        public void sortColors(int[] nums) {
            int low = 0;
            int high = nums.length-1;
            int mid = 0;

            while(mid <= high) {
                if(nums[mid] == 0) {
                    swap(nums,mid,low);
                    low++;
                    mid++;
                }
                else if(nums[mid] == 2) {
                    swap(nums, mid, high);
                    high--;
                }
                else {
                    mid++;
                }
            }
        }
        private void swap(int nums[], int mid, int high) {
            int temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
        }
    }
}
