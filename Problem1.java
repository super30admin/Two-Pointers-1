// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    
    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public void sortColors(int[] nums) {
        int a = 0;
        int b = 0;
        int c = nums.length-1;
        
        while (b <= c) {
            if (nums[b] == 2) {
               swap(nums, b, c);
                c--;
            }
            else if (nums[b] == 1) {
                b++;
            }
            else if (nums[b] == 0) {
                swap(nums, b, a);
                b++;
                a++;
            }
        }
    }
}