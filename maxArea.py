#TimeComplexity:O(N) 
#SpaceComplexity: No extra space used 
#Did this code successfully run on Leetcode : Yes 
#Any problem you faced while coding this : No
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        low=0; high=len(height)-1
        Max=0
        while low<high:
            if height[low]<height[high]:
                Max=max(Max,(high-low)*(height[low]))
                low+=1
            else : 
                Max=max(Max,(high-low)*(height[high]))
                high-=1
        return Max