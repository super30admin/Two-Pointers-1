class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        :time complexity: O(n)
        :space complexity:O(1)
        """
        if len(height)==0 or height is None:
            return 0
        maxx=0
        n=len(height)
        low=0
        high=n-1
        while low<=high:
            # get max area
            maxx = max(maxx, (high-low)*min(height[low], height[high]))
            if height[low]<height[high]:
                low+=1
            else:
                high-=1
        return maxx
        