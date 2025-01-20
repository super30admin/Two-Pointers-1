// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// We swap the 2 with right pointer and decrememnt mid. We swap the 0 with left pointer and inc left. everytime we compare with mid.
// We swap mid when 1, we need to keep moving mid so as to go through array (with left)
// we stop when mid= or > right

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        int n = nums.length;
        int left = 0, right = n-1, mid = 0;
        while(mid<=right){
            if(nums[mid]==0){
                swap(nums, mid, left);
                left++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, right);
                right--;
            }
            else{
                mid++;
            }
        }
    }
    private void swap(int [] nums, int i, int j){
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }
}