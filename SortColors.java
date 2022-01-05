// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// Soved uasing Dutch National Flag Algorithm

class Solution {
    public void sortColors(int[] nums) {
        
        //edge case
        if(nums == null || nums.length == 0) return;
        
        
        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        int temp;
        
        while(mid <= high){
            if(nums[mid] == 0){
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low ++;
                mid ++;
                
            } else if(nums[mid] == 2){
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high --;
            } else{
                mid ++;
            }
        }
        
    }
}