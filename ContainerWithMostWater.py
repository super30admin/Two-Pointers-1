#Time Complexity : O(n) where n is the number of elements in the array
#Space Complexity : o(1)

#Did this code successfully run on Leetcode : Yes
#Three line explanation of solution in plain english: Keeping two pointers, one from the start and one from the end of the array and keep moving pointers in as condition till start pointer reaches or passes end pointer. To calculate maxArea, keep a variable and to calculate the area between the two ends, subtract the two pointers to get the width multiplies by minimum height of of either ends. And the move the start or the end pointer whichever is smaller as we want the max area.

#Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height:
            return 0
        maxArea, l, r = 0, 0, len(height)-1

        while l < r:
            maxArea = max(maxArea, (r-l)*min(height[l], height[r]))

            if height[l] < height[r]:
                l += 1
            else:
                r -= 1

        return maxArea
