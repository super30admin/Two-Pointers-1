// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class SortColors {
    public void sortColors(int[] nums) {
        if(nums.length==1)
            return;
        
        int movingPointer = 0;
        int currIndex = 0;
        
        while(movingPointer<nums.length) {
            if(nums[movingPointer]==0){
                swap(movingPointer,currIndex,nums);
                currIndex++;
            }
            movingPointer++;
        }
        
        movingPointer = currIndex;
        while(movingPointer<nums.length) {
            if(nums[movingPointer]==1){
                swap(movingPointer,currIndex,nums);
                currIndex++;
            }
            movingPointer++;
        }
    }
    
    public void swap(int i,int j,int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
