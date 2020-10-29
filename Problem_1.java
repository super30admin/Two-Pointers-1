// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No



class Solution {
    public void sortColors(int[] nums) {
        
        // edge case
        if(nums.length == 0 || nums == null) return;
        
        int low =0 ; int mid =0; int high = nums.length-1;
        
        while(mid<=high){
            
            // case 1 element ==1, just increment mid
            if(nums[mid]==1){
                mid++;
                // case 2 element ==2, swap mid with high and decrement high
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else{
                // when element == 0, swap low with mid, increment both low and mid
                swap(nums,mid,low);
                low++;mid++; // if we dont do mid++, then there will be issue when low and high point to same element
            }
        }
        
        
    }
    