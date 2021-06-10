class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        :time complexity: O(n^2)
        :space complexity:O(1)
        """
        if len(height)==0 or height is None:
            return 0
        maxx=0
        n=len(height)
        
        for i in range(n-1):
            for j in range(i+1, n):
                maxx = max(maxx, (j-i)*min(height[i],height[j]))
        
        return maxx
        