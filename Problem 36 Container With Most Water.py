# Did this code successfully run on Leetcode: Yes
# Time Complexity: O(n)
# Space Complexity: O(1)
# Logic: put 1 pointer at start & one at end, calculate total water it holds with lower height. update pointers
# according to the whichever height is lower. return max water

class Solution:
    def maxArea(self, height):
        i = 0
        j = len(height) - 1
        max_water = 0
        while i < j:
            if height[i] < height[j]:
                max_water = max(max_water, (height[i]*(j-i)))
                i += 1
            else:
                max_water = max(max_water, (height[j] * (j - i)))
                j -= 1
        return max_water
