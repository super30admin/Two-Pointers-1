# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
    def maxArea(self, height):
        # edge case
        if not height or len(height) == 0:
            return 0
        max_area = 0
        low, high = 0, len(height) - 1
        while low < high:
            max_area = max(max_area, min(height[low], height[high]) * (high - low))
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return max_area

r = Solution()
height = [1,8,6,2,5,4,8,3,7]
print("Max area of water is:", r.maxArea(height))
