class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        #         area=0
        #         for i in range(len(height)-1):
        #             wid=0

        #             for j in range(i+1,len(height)):
        #                     area=max(area,min(height[i],height[j])*(j-i))
        #         return area
        # time=O(n**2) space=O(1)
        area = 0

        low = 0
        high = len(height) - 1
        while low < high:
            if height[low] < height[high]:
                area = max(area, height[low] * (high - low))
                low += 1
            else:
                area = max(area, height[high] * (high - low))
                high -= 1
        return area
    # time=O(n) space=O(1)