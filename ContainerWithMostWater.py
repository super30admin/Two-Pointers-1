# 11. Container With Most Water
"""
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

Area is dependent on two factors, height and width.
height = min(element1, element2)
width = index(element1) - index(element2)
So, optimul solution is that we use two pointers low and high and check area covered by them.
and then change position of pointer which is less than other.
While doing this, we can keep track of maximum area.

We will change pointer which is lesser in value because it will be the one which limits the area.

If we change pointer which is higher in value, then there is chance that we might lose track of max area covered.
"""


class Solution:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height) - 1
        area = 0

        while low < high:

            # calculating h and w to calculate area
            h = min(height[low], height[high])
            w = high - low
            temp_area = h * w

            # keeping track of max area covered till now
            if temp_area > area:
                area = temp_area

            # changing value of pointer which is less in value.
            if height[low] < height[high]:
                low += 1
            else:
                high -= 1

        return area