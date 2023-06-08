# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

#  We start with 2 pointers on the edges and greedily choose the side to bring closer
#  We do this because there is no point of moving the larger wall closer, 
# since the smaller wall is the bottleneck for the area in between to increase.

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l, r = 0, len(height)-1
        maxVal = 0
        
        while l<=r:
            maxVal = max(maxVal, (r-l) * min(height[l], height[r]))
            if height[l] <= height[r]:
                l+=1
            else:
                r-=1
        
        return maxVal