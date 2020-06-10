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