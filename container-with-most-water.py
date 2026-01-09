''' Time Complexity : O(n) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No
'''

class Solution:
    def maxArea(self, height: List[int]) -> int:
        n= len(height)
        l, r = 0, n-1
        maxarea = 0
        while l < r:
            h = min(height[l],height[r])
            w = (r - l)
            area = h * w
            maxarea = max(maxarea, area)
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
        return maxarea