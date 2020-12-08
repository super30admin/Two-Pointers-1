class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        #O(N)
        #O(1)
        if not height:
            return 0
        i=0
        j=len(height)-1
        #result max area
        maxS=0
        while i<j:
            if height[i]<=height[j]:
                #move further away from smaller height, to compensate for lower width,
                #might find greater height
                maxS=max(maxS,min(height[j],height[i])*(j-i))
                i+=1
            elif height[i]>height[j]:
                maxS=max(maxS,min(height[i],height[j])*(j-i))
                j-=1
        return maxS
                
            
            