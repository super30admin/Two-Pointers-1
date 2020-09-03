// Time Complexity : O(n), n -> length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't solve with the 2 pointer approach


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0) return;
        
        int redCount = 0, whiteCount = 0, blueCount = 0;
        
        for(int i = 0; i < nums.length; i++) {
            
            if(nums[i] == 0) {
                redCount++;
            } else if (nums[i] == 1) {
                whiteCount++;
            } else if (nums[i] == 2) {
                blueCount++;
            }
        }
        
        for(int i = 0; i < redCount; i++) {
            nums[i] = 0;
        }
        
        for(int i = redCount; i < redCount + whiteCount; i++) {
            nums[i] = 1;
        }
        
        for(int i = redCount + whiteCount; i < nums.length; i++) {
            nums[i] = 2;
        }
    }
}


// 2nd APPROACH

// TC: O(n)
// SC: O(1)

class Solution {
    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0) return;
        
        int left = 0, right = nums.length - 1, cur = 0;
        
        while(cur <= right) {
            
            if(nums[cur] == 0) {
                swap(nums, cur, left);
                left++;
                cur++;
            } else if(nums[cur] == 1) {
                cur++;
            } else {
                swap(nums, cur, right);
                right--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j] = temp;
    }
}