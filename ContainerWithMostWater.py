
#TC: O(n)
#SC: O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        l=len(height)
        h=l-1
        l=0
        a1=0
        while(l<h):
            if(height[l]>=height[h]):
                a=(h-l)*height[h]
                h=h-1
            elif(height[l]<height[h]):
                a=(h-l)*height[l]
                l=l+1
            if a>a1:
                a1=a
        return a1
        
