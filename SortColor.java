 
// Time Complexity : n^2
//Space Complexity : O(n) 
//Did this code successfully run on Leetcode : Yes
----------Sort Color _____________
class Solution {
    public void sortColors(int[] nums) {
       int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;
        
        for(int i = 0 ; i< nums.length; i++){
            if(nums[i] == 0){
                redCount++;
            }
            else if(nums[i] == 1){
                whiteCount++;
            }
            
            else{
                blueCount++;
            }
        }
        
        int j = 0;
        while(redCount > 0){
            nums[j] = 0;
            redCount--;
            j++;
        }
        
        while(whiteCount > 0){
            nums[j] = 1;
            whiteCount--;
            j++;
        }
        
        while(blueCount > 0){
            nums[j] = 2;
            blueCount--;
            j++;
        }
        
        
    }
}

//----------As Shown in class------------- 
// Time Complexity : O(n)
//Space Complexity : O(1) 
//Did this code successfully run on Leetcode : Yes
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        
        while (mid <= high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            else {
                swap(nums,low, mid);
                low++;
                mid++;
            }
        }

    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}