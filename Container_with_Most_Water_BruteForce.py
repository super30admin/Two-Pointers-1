# Created by Aashish Adhikari at 9:03 AM 1/9/2021

'''
Time Complexity:
O(n^2)
Space Complexity:
O(1)
'''

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """

        maxx = 0
        for idx in range(len(height)):

            for idxx in range(idx+1, len(height)):
                area = min(height[idx], height[idxx]) * (idxx - idx)
                if area > maxx:
                    maxx = area

        return maxx