# Leetcode 11. Container With Most Water

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Iterate over array with high and low pointers from the ends. If area is greater than maxx
# replace it. If the value at lower bound is smaller, increment low else decrement high pointer. Return maxx.

# Your code here along with comments explaining your approach

class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxx = 0
        low  = 0
        high = len(height)-1
        while low <= high:
            for i in range(len(height)):
                area = min(height[low],height[high])* (high-low)

                if area >= maxx:
                    maxx = area
                if height[low] < height[high]:
                    low += 1
                else:
                    high-=1
        return maxx