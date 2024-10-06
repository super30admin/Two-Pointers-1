#T.C = O(m) S.C = O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        m = len(height)
        low=0
        high=m-1
        result=0

        while(low<high):
            h=0
            w=high-low
            if(height[low]<height[high]):
                h=height[low]
                low+=1
            else:
                h=height[high]
                high-=1
            
            result = max(result,h*w)
        return result
