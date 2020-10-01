// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : 0ms 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach


// Basically here, if any 0 is encountered it is incrementally put at the first place and the start pointer is incremented and if 2 is encountered, it is put at the last place and end pointer is decremented.



class Solution {
    public void sortColors(int[] nums) {
        
        int start = 0;
        
        int end = nums.length-1;
        
        for(int i = 0; i <= end;){
            if(nums[i] == 0){ 
                int temp = nums[i];
                nums[i] = nums[start];
                nums[start] = temp;
                start++;
                i++;
            }
            else if(nums[i] == 1){
                i++;
            }
            else{
                int temp = nums[i];
                nums[i] = nums[end];
                nums[end] = temp;
                end--;
            }
            
        }
        
    }
}