# Time Complexity : O(n) where n is the length of list.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Class Solution.
class Solution:
    def maxArea(self, height: List[int]) -> int:
        max1 = 0
        low = 0
        high = len(height) - 1
        while(low<high):
            water_content = min(height[low],height[high]) * (high - low)
            max1 = max(water_content,max1)
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1
        return max1
