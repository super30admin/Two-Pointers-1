# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

'''
The area is maximised by the maximum height and the maximum difference. 
Hence, moving both left and right inward at once is never going to work. 
Why does moving the smaller pillar inward work? Moving the smaller pillar inward works because
we have already recorded the height gotten by this pair. If there is a better pair then it has to
be one which uses the taller pillar, right?
That is the intuition.
'''


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0
        right = len(height) - 1
        
        maxArea = 0
        while left < right:
            currArea = min(height[left], height[right]) * (right - left)
            maxArea = max(maxArea, currArea)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        
        return maxArea