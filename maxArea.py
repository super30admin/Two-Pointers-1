"""
Approach:
Here we are using 2 pointers to calculate the max area
left pointer is initialized to 0th element and right pointer to last element of the array. maxarea to 0
we iterate till left pointer crosses the right pointer. 
Initially we calculate area by taking minheight(left,right) * (right-left)
now compare the previous maxarea with current area and assigns it the maxarea
Now we have to move the based based on the heights.
if (height[l] > height[r]), then we move the right pointer to left i.e decrement right pointer
else(if left <= right) we move the left pointer to right i.e increment
In the end we get the maxArea.

Time Complexity: O(n)
Space Complexity: O(1)

Passed in Leetcode: Yes
Any difficulties: No
"""
from typing import List
class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxArea = 0
        while (l < r):
            h = min(height[l],height[r])
            w = r -l
            maxArea = max (maxArea, h * w)
            if (height[l] > height[r] ):
                r -= 1
            else:
                l += 1
        return maxArea

sol = Solution()
height = [1,8,6,2,5,4,8,3,7]
print(sol.maxArea(height))