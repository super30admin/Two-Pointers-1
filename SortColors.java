// Time Complexity : O(n)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No difficulties were faced


class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums==null) return;
        int left = 0; int right = nums.length-1; int mid = 0;
        while(mid<=right){
            if(nums[mid]==2){
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                swap(nums,mid,left);
                mid++; 
                left++;
            }
        }
        
    }
    private void swap(int []nums,int a,int b){
        if(nums[a]!=nums[b]){
        nums[a] = nums[a] + nums[b];
        nums[b] = nums[a] - nums[b];
        nums[a] = nums[a] - nums[b];
        }
    }
    
}
