# Time Complexity :O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no


# Your code here along with comments explaining your approach
# Use two pointers at the left and right ends to maximize width initially.
# Compute the area by using the shorter height, then move the pointer pointing to the smaller height to try for a taller boundary.
# Keep updating the maximum area until both pointers meet.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        low =0
        high = len(height)-1
        area = 0
        while low < high:
            w = high-low
            if height[low]<height[high]:
                h = height[low]
                low += 1
            else:
                h = height[high]
                high -= 1
            area = max(area, h*w)
        return area
        