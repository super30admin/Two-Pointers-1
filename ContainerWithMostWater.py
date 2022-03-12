# Time Complexity :
# Space Complexity :
# Did this code successfully run on Leetcode :
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        area=0
        low = 0
        high = len(height)-1
        while(low<high):
            area =max(area, min(height[low],height[high])*(high-low))
            if (height[low]>height[high]):
                high = high - 1
            else:
                low = low + 1
        return area
            