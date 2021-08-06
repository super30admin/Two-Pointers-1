class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        #O(n)
        n = len(height)
        low,high = 0, n-1
        maxArea = 0
        while low < high:
            area = (high - low) * min(height[low],height[high])
            maxArea = max(area,maxArea)
            if height[low] < height[high] :
                low += 1
            else:
                 high -= 1
        return maxArea
        #O(1)
        # maxArea = 0
        # n = len(height)
        # for i in xrange(n-1):
        #     for j in xrange(i+1,n):
        #         area = (j - i) * min(height[i],height[j])
        #         maxArea = max(area,maxArea)
        # return maxArea
