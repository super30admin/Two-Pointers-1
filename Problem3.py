#  Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : No
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        first = 0
        last = len(height)-1
        max_area = 0
        while first < last:
            length = last - first
            if(height[first] <= height[last]):
                max_area = max(max_area, (length*height[first]))
                first += 1
            else:
                max_area = max(max_area, (length*height[last]))
                last -= 1
        return max_area
        
        