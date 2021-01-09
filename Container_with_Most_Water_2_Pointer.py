# Created by Aashish Adhikari at 9:18 AM 1/9/2021

'''
Time Complexity:
O(n)
Space Complexity:
O(1)
'''

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        low = 0
        high = len(height)-1
        maxx = 0

        while low < high:

            area = min(height[low], height[high]) * (high-low)

            if area > maxx:
                maxx = area

            if height[low] < height[high]:
                low += 1
            else:
                high -= 1

        return maxx

