"""
// Time Complexity : O(N)
// Space Complexity : O(3)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        first = 0
        last = len(nums) - 1
        curr = 0
        
        while curr <= last:
            
            if nums[curr] == 0:
                
                # Swap first and curr element
                nums[first], nums[curr] = nums[curr], nums[first]
                
                first += 1
                curr += 1
            elif nums[curr] == 2:
                
                # Swap last and curr element
                nums[last], nums[curr] = nums[curr], nums[last]
                last -= 1
            else:
                curr += 1
        