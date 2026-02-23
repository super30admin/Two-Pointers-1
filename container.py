
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: Use two pointers at the start and end of the array to compute area formed by the lines.
# Move the pointer with the smaller height to potentially find a larger area, updating the maximum each step.






class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        res = 0
        while left < right:
            if height[left] > height[right]:
                curr_amt = (right - left) * height[right]
                right -=1
            else:
                curr_amt = (right - left) * height[left]
                left += 1
            res = max(res,curr_amt)
        
        return res




