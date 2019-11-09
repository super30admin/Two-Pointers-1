class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if height == []: #edge case
            return 0
        #width is calculate dwith indexes
        low = 0
        high = len(height)-1
        max_area = 0
        while low < high:
            curr_area = min(height[high],height[low]) * (high -  low)
            max_area = max(curr_area,max_area)
            if height[low] < height[high]:
                low  += 1
            else:
                high -= 1
        return max_area