class Solution(object):
    def maxArea(self, height):
        i = 0
        j = len(height) - 1
        resultmax = 0
        while(i < j):
            area = (j-i) * min(height[i],height[j])
            if area > resultmax:
                resultmax = area
            if(height[i] < height[j]):
                i = i + 1
            elif (height[i] >= height[j]):
                j = j - 1
        return resultmax
        """
        :type height: List[int]
        :rtype: int
        """
       #time = O(n)
       #space = O(1)