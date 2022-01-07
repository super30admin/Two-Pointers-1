// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {

        // check if input array is null or empty
        if(nums == null || nums.length == 0) return;
        
        // initialize two pointers from start and end 
        int start = 0;
        int end = nums.length - 1;

        // initialize current pointer as 0 (to traverse the array)
        int current = 0;
        
        // traverse until current pointer crosses end pointer
        while(current <= end){
            

            // if current element is 0 replace it with start element and increment the start and current pointer by 1
            if(nums[current] == 0){
                
                int temp = nums[start];
                nums[start] = nums[current];
                nums[current] = temp;
                
                start++;
                current++;
            }

            // if current element is 2 replace it with end element and decerement the end pointer by 1
            else if(nums[curr] == 2){
                
                int temp = nums[end];
                nums[end] = nums[current];
                nums[current] = temp;
                
                end--;
            }
            
            // if current element is 1 increment the current pointer by 1
            else{
                current++;
            }
        }
    }
}