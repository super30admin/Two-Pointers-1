# // Time Complexity : O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :yes



class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height==[]:
            return 0
        low=0
        high=len(height)-1
        max1=0
        while(low<=high):
            max1=max(max1,min(height[low],height[high])*(high-low))
            if (height[low]<height[high]):
                low=low+1
            else:
                high=high-1
        return max1 