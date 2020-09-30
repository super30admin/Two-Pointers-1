# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def maxArea(self, height):
        l=0
        r=len(height)-1
        area = 0
        while l<r:
            L=r-l
            B=min(height[l],height[r])
            area = max(area,L*B)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1
        return area