class Solution(object):
    def maxArea(self, height):
        # tc : O(n)
        # sc : O(1)
        # ran successfully on leetcode
        """
        :type height: List[int]
        :rtype: int
        """

        # approach : start pointer from the beginign of the array and the end pointer from the end of the array
        # compare which height is small and get the width by diff of indexs and the area = h*w
        # now move one pointer lets say h[start] < h[end] move start to the right by 1 because as we move we might get a higher height which
        # will give us max area, if h[end] < h[start] end move to the left same logic and compare the area to get the max area

        start = 0
        end = len(height) - 1
        area = 0

        while (start < end) :
            if height[start] < height[end]:
                area = max(area, height[start]*(end-start))
                start +=1
            else :
                area = max(area, height[end]*(end-start))
                end -= 1

        return area
