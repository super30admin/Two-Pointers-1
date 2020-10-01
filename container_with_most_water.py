"""
Problem: 11. Container With Most Water
Leetcode: https://leetcode.com/problems/container-with-most-water/
Solution: Use two pointers to calculate the area between two jars
Time Complexity: O(n)
Space Complexity: O(1)
"""


class Solution:
    def maxArea(self, height):
        # Base case
        if height is None or len(height) is 0:
            return

        # Assign min value
        result = -float('inf')

        # Define two pointers
        left = 0
        right = len(height) - 1

        while left < right:
            result = max(result, min(height[left], height[right]) * (right - left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return result


obj = Solution()
print(obj.maxArea([1,8,6,2,5,4,8,3,7]))