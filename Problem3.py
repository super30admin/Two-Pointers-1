# // Time Complexity :O(N)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :YES
# // Any problem you faced while coding this :NO
# https://leetcode.com/problems/container-with-most-water/

# // Your code here along with comments explaining your approach
class Solution:
  """
  Move towards max height as width is becoming smaller and smaller and we will considering min of both heights
"""
    def maxArea(self, height: List[int]) -> int:
        n=len(height)
        l,r=0,n-1
        area=0
        while(l<r):
            area=max(area,min(height[l],height[r])*(r-l))
            if height[l]>height[r]:
                r-=1
            else:
                l+=1
        return area
        
