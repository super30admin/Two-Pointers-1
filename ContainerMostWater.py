# Time Complexity - O(N)

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : No

# Any problem you faced while coding this : No

# Approach
# I use a two pointer approach where low=0 and high=n-1 . I compute the area using (high-low)*min(nums[high],nums[low]).

class Solution:
    def maxArea(self, height: List[int]) -> int:

        if height == None or len(height) == 0:
            return 0

        low, high = 0, len(height) - 1
        maxArea = float('-inf')

        while (low < high):
            maxArea = max(maxArea, (high - low) * min(height[high], height[low]))
            if height[high] < height[low]:
                high -= 1
            else:
                low += 1

        return int(maxArea)
