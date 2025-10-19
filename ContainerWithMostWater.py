# Time Complexity : O(n) where n is the number of containers
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
Keep two pointers left and right that move depending on bigger height and variable that tracks the global max.
(since distance between the containers always gets shorter, we need to maximize the height)
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0

        l = 0
        r = len(height)-1

        while l <= r:
            maxArea = max(maxArea, min(height[l], height[r]) * (r-l))
        
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1

        return maxArea