# Problem #36 Container With Most Water
#LeetCode #11 https://leetcode.com/problems/container-with-most-water/description/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# Move away from smaller height 
# Get maximum volume between left and right with max width. So no other inner heights will give you the max volume from current point

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxv = 0
        while l < r:
            if height[l] < height[r]:
                v = height[l] * (r-l)
                maxv = max(maxv,v)
                l+=1
            else:
                v = height[r] * (r-l)
                maxv = max(maxv,v)
                r-=1
        return maxv