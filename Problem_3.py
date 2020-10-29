"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


Your code here along with comments explaining your approach:
Here, we keep one pointer at 0 position and another to the last. At every point we calculate the area
that the two towers enclose. The area would be multiplication of distance between them and height
of minimum tower. We compare the area calculated with the maxarea till now. For moving forward,
we move the pointer whose height is smaller. This is  because, if we move the pointer with greater height,
the area afterwards is always going to get smaller , as the distance reduces and smaller height remaining
the same.
"""


class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        area = 0
        if not height:
            return area
        left = 0
        right = len(height)-1
        while left < right:
            area = max(area, min(height[left], height[right])*(right-left))
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1
        return area
