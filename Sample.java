// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {

    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        int i = 0;

        while(i <= r){
            int num = nums[i];
            if(num == 0){
                swap(i, l, nums);
                i++;
                l++;
            } else if(num == 2){
                swap(i, r, nums);
                r--;
            } else i++;
        }
    }
}
