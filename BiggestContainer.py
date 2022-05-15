# Time complexity: O(n) where n is the length of the matrix.
# Space complexity: O(1).
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_area = 0
        left = 0                    # Left pointer
        right = len(height) - 1     # Right pointer
        while left < right:
            max_area = max(max_area, min(height[left], height[right]) * (right - left))
            if height[left] <= height[right]:   # Move left by 1.
                left += 1
            else:                               # Move right by 1.
                right -= 1
        return max_area
        
        # Brute force method
        # TC: O(n * n)
        # SC: O(1)
        # max_area = 0
        # for i in range(len(height)):
        #     for j in range(i + 1, len(height)):
        #         max_area = max(max_area, min(height[i], height[j]) * (j - i))
        # return max_area