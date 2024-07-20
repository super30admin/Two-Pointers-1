#brute force - time limit exceeded
# TC O(n^2) and SC O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if height == None or len(height) == 0:
            return 0
        maximum = 0
        for i in range(len(height)):
            for j in range(i+1, len(height)):
                maximum = max(maximum , min(height[i],height[j])*(j-i))
        return maximum

#2 pointer approach 
#TC O(n) and SC O(1)
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if height == None or len(height) == 0:
            return 0
        maximum = 0
        left = 0 
        right = len(height)-1
        while left < right: #O(n)
            maximum = max(maximum, min(height[left],height[right])* (right-left))
            if height[left] < height[right]:
                left = left + 1
            else:
                right = right -1
        return maximum

