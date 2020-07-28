# Time Complexity : O(n) where n is number walls inside the list
# Space Complexity : O(1) we are not creating any space.
# Did this code successfully run on LeetCode : yes
# Any problem you faced while coding this : No


# We use two pointer approach, we start one with the beginning of the list, and another with last of the list
# we will compute the area and update if it is maxvalue
# we will decide to move to the next wall, by moving forward from the wall which is currently lower, which we can
# compute from comparing two pointers values.

class Solution:
    def maxArea(self, height: List[int]) -> int:

        pt1 = 0
        pt2 = len(height) - 1

        maxValue = 0

        while pt1 < pt2:

            w = pt2 - pt1

            h = min(height[pt1], height[pt2])

            area = w * h

            if area > maxValue:
                maxValue = area

            if height[pt1] > height[pt2]:

                pt2 -= 1

            else:

                pt1 += 1

        return maxValue




