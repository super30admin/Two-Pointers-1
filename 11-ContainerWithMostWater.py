#Time Complexity : O(n) 
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this :
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height)-1
        maximum = 0
        while l < r:
            maximum = max(maximum,min(height[l],height[r]) * (r-l))
            if height[l] < height[r]:
                l = l + 1
            else:
                r = r - 1
        return maximum