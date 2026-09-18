# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
#I have used two pointer approach to reduce from n2 time to n. Using left and right pointer we can get the min height to contain the water
#Then calculate the area by multiplying minimum height
# Increment the left if left < right else decrement the right pointer

class Solution:
    def maxArea(self, height: list[int]) -> int:
        left = 0
        right = len(height)-1
        maxArea = 0
        while left < right:
            minheight = min(height[left], height[right])
            currentArea = (right - left) * minheight
            maxArea = max(currentArea,maxArea)
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return maxArea
