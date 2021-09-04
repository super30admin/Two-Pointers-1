# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach




class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi=0
        low=0
        high=len(height)-1
        while(low<high):
            maxi=max(maxi,min(height[low],height[high])*(high-low))
            if height[high]<=height[low]:
                high=high-1
            else:
                low=low+1
        return maxi
        