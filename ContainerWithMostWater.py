# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Two pointers at both ends and keep checking the area between them.
# Move the pointer of shorter line

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxAmt = 0
        left, right = 0, len(height) - 1

        while left < right:
            w = right - left

            if height[left] < height[right]:
                h = height[left]
                left += 1
            else:
                h = height[right]
                right -= 1

            currAmt = h * w
            maxAmt = max(maxAmt, currAmt)

        return maxAmt
        