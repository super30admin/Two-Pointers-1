# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach: 2 pointers left and right, calculate area at each and then update
# the max if curr area is greater than the max. And then move the pointer which has the less height.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxArea = 0
        p1 = 0
        p2 = len(height) - 1
        while(p1 < p2):
            currArea = min(height[p1], height[p2]) * (p2 - p1)
            maxArea = max(maxArea, currArea)
            if(height[p1] < height[p2]):
                p1 += 1
            else:
                p2 -= 1
        return maxArea