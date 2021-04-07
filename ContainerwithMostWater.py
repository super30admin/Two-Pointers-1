class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        # Time Complexity is O(n)
        # Space complexity is O(1)
        # Maintain two pointers, one in the start and other in the end to calculate the area bounded by the pointers,
        # since the maximum area depends on the minimum height, update the pointer of minimum height
        l = 0
        r = len(height)-1
        maxArea = 0
        while(l <= r):
            currArea = min(height[l],height[r])*(r-l)
            maxArea = max(maxArea,currArea)
            if(height[l] < height[r]):
                l+=1
            else:
                r-=1
        return maxArea