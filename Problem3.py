# Problem3 (https://leetcode.com/problems/container-with-most-water/)
# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes

# We use two pointers starting at both ends of the array.
# We calculate the water between them and move the shorter pointer inward.
# We keep updating the maximum area found during this process.

class Solution:

    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        low, high = 0, n - 1   # low starts at leftmost line, high starts at rightmost line
        area = 0                # stores the maximum water found so far

        while low < high:               # stop when pointers meet — no container possible
            h = 0
            width = high - low          # width = distance between the two pointers

            if height[low] < height[high]:  # left line is shorter
                h = height[low]             # water is limited by the shorter (left) line
                low += 1                    # move left pointer inward to look for a taller line
            else:                           # right line is shorter or equal
                h = height[high]            # water is limited by the shorter (right) line
                high -= 1                   # move right pointer inward to look for a taller line

            area = max(area, h * width)     # update max area if current container holds more water

        return area