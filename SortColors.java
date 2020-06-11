class Solution {
    // Time Complexity : O(length of nums)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
    
    public void sortColors(int[] nums) {
        int[] count = new int[3];
        
        for(int i =0;i<nums.length;i++){
            count[nums[i]]++;
        }
        
        int index =0;
        for(int i =0;i<count.length;i++){
            int x = count[i];
            while(x>0 && index<nums.length){
                nums[index] = i;
                index++;
                x--;
            }
        }
    }
    
}


class Solution {
    // Time Complexity : O(length of nums)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/*
1. Maintain 3 pointers, low, mid, high
2. 0 -->low-1        0
   low -->mid-1      1
   mid--> high       unknown
   high+1 --> end    2
*/
    
    public void sortColors(int[] nums) {
                
        int low = 0; int mid = 0; int high = nums.length-1; 
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a]= temp;
    }
    
}