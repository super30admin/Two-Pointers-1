# // Time Complexity :O(N)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :no
class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi=0
        l=0
        r=len(height)-1
        while(l<r):
            maxi=max(maxi,min(height[l],height[r])*(r-l))
            if(height[l]<height[r]):
                l=l+1
            else:
                r=r-1
        return maxi