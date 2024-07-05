// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// take three pointers: left right and mid. if 2 is encountered place it at the very end (right ptr)
// if 0 is encountered place it at the very start (left)

class Solution {
    void swap(int a, int b, int[] nums) {
        if(a != b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
    public void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while(mid<=right) {
            if(nums[mid] == 0) {
                swap(mid,left,nums);
                left++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(mid, right,nums);
                right--;
            } else {
                mid++;
            }
        }
    }
}