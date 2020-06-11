# All analysis is for the solution on line 21 and beyond.
# Time Complexity : O(n), where n is the length of the height array.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes!
# Any problem you faced while coding this : no

# Your code here along with comments explaining your approach
class Solution(object):
    # Approach 1 Brute Force/Time Limit Exceeded
    def max(self, height):
        if not height:
            return 0

        n, maxArea = len(height), 0
        for i in range(n - 1):
            for j in range(i + 1, n):
                area = (j - i) * min(height[i], height[j])
                maxArea = max(maxArea, area)

        return maxArea

    # By maintaining two pointers, each starting from the two ends, traversing the array
    # and calculating the area for each container and storing it in the maxArea if greater.
    # From the two pointers, the one with the smaller height is moved because height constraints
    # the area and there is a possibility of finding a bigger area by moving away from smaller height.
    def maxArea(self, height):
        if not height:
            return 0

        maxArea, left, right = 0, 0, len(height)-1
        while left < right:
            area = (right - left) * min(height[left], height[right])
            maxArea = max(area, maxArea)

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return maxArea
