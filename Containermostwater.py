class Solution(object):
    def maxArea(self, heights):
        """
        :type height: List[int]
        :rtype: int
        """
        area=0
        l=0
        r=len(heights)-1
        while(l<=r):
            
            area=max(area,min(heights[l],heights[r])*(r-l) )
            if heights[l]>heights[r]:
                r=r-1
            else:
                l=l+1
        return area
    