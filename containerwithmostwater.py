#https://leetcode.com/problems/container-with-most-water/
#time-o(n)
#space-o(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxanswer=0
        low=0
        n=len(height)
        high=n-1
        
        while low<high:
            maxanswer=max(maxanswer,(high-low)*min(height[low],height[high]))
            if height[low]<height[high]:
                low+=1
            else:
                high-=1
        return maxanswer
                