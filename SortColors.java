// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Take 3 pointers,p and l at 0 and r at length-1
//We will keep moving pointer p, if we get 2 swap with r and if we get 0 swap with l.
//Increment the counters accordingly, exit when p <=r
class Solution {
    public void sortColors(int[] nums) {
        int p = 0, l = 0, r = nums.length -1;
        while(p <= r){
            if(nums[p] == 1){
                p++;
            }
            else if(nums[p] == 2){
                swap(nums,p, r);
                    r--;
            }
            else{
                swap(nums,l,p);
                l++;
                p++;
            }
        }
        
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}