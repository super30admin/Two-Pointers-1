class Solution(object):
    def maxArea(self, height):
        """
        Time complexity: O(n) Space complexity: O(1)
        :type height: List[int]
        :rtype: int
        """
        left = 0
        right = len(height)-1
        maxArea = 0

        while(left < right):
            area = min(height[left], height[right]) * (right-left)
            maxArea = max(area, maxArea)
            if(height[left] < height[right]):
                left +=1
            else:
                right-=1
        
        return maxArea