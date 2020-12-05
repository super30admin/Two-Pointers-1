/*
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums is None or len(nums) == 0:
            return
        
        low, high= 0, len(nums) - 1
        mid = 0
        
        while mid <= high:
            if nums[mid] == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
                
            elif nums[mid] == 2:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
                
            else:
                mid += 1
*/

// Time Complexity : O(n) where n is array size
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Maintained two pointers and swapped with low pointer for 0 and with
// high pointer for 2. 1 automatically got sorted
class Solution {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0){
            return;
        }
        
        int low = 0, high = nums.length - 1, mid = 0;
        while (mid <= high){
            if (nums[mid] == 0){
                swap(low, mid, nums);
                low ++;
                mid ++;
            }
            else if (nums[mid] == 2){
                swap(high, mid, nums);
                high --;
            }
            else{
                mid ++;
            }
        }
    }
    
    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}