# Time Complexity = O(n) 
# Space Complexity = O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def maxArea(self, nums: List[int]) -> int:
        
        maxarea = 0
        
        l, r = 0, len(nums) - 1
        
        while l < r :
            
            # calculates the area of two heights
            maxarea = max(maxarea, min(nums[l], nums[r]) * (r - l));
            
            # if height of left is smaller increment left pointer
            if nums[l] < nums[r]:
                
                l += 1
              
            # if height of right is smaller decrement right pointer
            else: 
                
                r -= 1
            
        return maxarea