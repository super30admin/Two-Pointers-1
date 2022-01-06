"""
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.





// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

"""

class Solution:
    def maxArea(self, height: list[int]) -> int:
        # length of input array
        sizeArr = len(height) - 1
        # maximal width between leftmost stick and rightmost stick
        maxWidth = sizeArr

        # two pointers, left init as 0, right init as size-1
        left, right = 0, sizeArr
        # area also known as the amount of water initialized
        area = 0

        if len(height) is None or not height:
            return area
        # scan each possible width and compute maximal area
        for width in range(sizeArr, 0, -1):
            if height[left] < height[right]:
                 # the height of lefthand side is shorter
                area = max(area, width * height[left])
                 # update left index to righthand side
                left += 1
            else: #right side is smaller
                area = max(area, width * height[right])
                right -= 1
        return area