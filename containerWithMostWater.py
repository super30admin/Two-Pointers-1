# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def maxArea(self, height: List[int]) -> int:  
        if not height or len(height) < 2:
            return 0
        maximum = 0
        left ,right = 0, len(height) -1

        while (left < right):
            maximum = max(maximum, min(height[left], height[right]) * (right - left) )
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maximum