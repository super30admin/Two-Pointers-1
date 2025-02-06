// Problem1 (https://leetcode.com/problems/sort-colors/)

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach in three sentences only
/*
 * In this problem, three-pointer approach is used. left, mid and right pointers are taken to keep track of 0's, 1's and 2's. left is at 0 index
 * mid is at 0 index and right is at last index at first. Then, comparisons are made with mid. If mid is 2 then swap mid and right and decrement
 * right pointer. Else if mid is 0 then swap mid with left and decrement left pointer. Else increment mid pointer as mid will have 1 itself.
 */

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int mid = 0;
        int r = n-1;
        // l tracks 0's, mid tracks 1's, r tracks 2's
        while(mid<=r){
            if(nums[mid]==2){
                swap(nums, mid, r);
                r--;
            }
            else if(nums[mid]==0){
                swap(nums, mid, l);
                l++; mid++;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int []nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}