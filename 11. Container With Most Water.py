# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    '''
    - use l,r as two pointers on either side
    - decrease the gap between two pointers based on shifting the lower height
    - calculate area and keep the max area at each iteration
    '''
    def maxArea(self, height: List[int]) -> int:
        max_amt = 0
        l,r = 0, len(height) - 1
        while l < r:
            amt = min(height[l], height[r]) * (r - l)
            if amt > max_amt:
                max_amt = amt
            # shifting the pointers based on min values    
            if  height[l] < height[r]:
                l += 1
            else:
                r -= 1

        return max_amt