#// Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : yes
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        left, right = 0, len(height) - 1

        while left < right:
            area = min(height[left], height[right]) * (right - left)

            maxArea = max(area, maxArea)
            if (height[left] < height[right]):
                left += 1
            else:
                right -= 1
        return maxArea