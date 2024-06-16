
"""
Two-Pointers-1

Problem3 (https://leetcode.com/problems/container-with-most-water/)

Time Complexity : O(n)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Your code here along with comments explaining your approach:
Tricks:
Width will always decrease so we should aim to get bigger height to get better max amount.
so we keep 2 variables left, right and we calculate maximum area of previous max and curr max by calculating minimum height of left right and multiply
with its width of right-left and we start moving from lesser height to forward inbelief of getting better height.
"""


# Brute force O(n^2)
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height or len(height) == 0:
            return 0

        n = len(height)
        max_amount = -1
        for i in range(n):
            for j in range(i+1, n):
                max_amount = max(max_amount, min(height[i], height[j]) * (j-i)) # area is min height * width 
        
        return max_amount

# Optimal 
class Solution:
    def maxArea(self, height: List[int]) -> int:
        if not height or len(height) == 0:
            return 0

        n = len(height)
        max_amount = -1
        left, right = 0, n-1

        while left < right:
            max_amount = max(max_amount, min(height[left], height[right]) * (right - left))

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return max_amount
