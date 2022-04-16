// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// this is the famous dutch national flag problem 
// here we make use of mid, low and high pointers. 
//mid does most of the work iterating through
// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int mid = 0;
        int low = 0;
        int high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high); // if we spot a 2 we swap with high
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, mid, low); // if we spot a 0 we swap with low
                low++;
                mid++;
            }
            else {
                mid++;
            }
        }
    }
    private void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}