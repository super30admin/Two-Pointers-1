# // Time Complexity : O(n) 
# // Space Complexity : O(1)   
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no

class Solution:
    def maxArea(self, height: List[int]) -> int:
        l = 0
        r = len(height) - 1
        maxi = 0
        while(l < r):
            area = min(height[l],height[r]) * (r - l)
            maxi = max(area,maxi)

            if (height[l] < height[r]):
                l += 1
            else:
                r -= 1
        
        return maxi

# Approach:
# 1. Initialize two pointers l and r to the first and last elements of the array.
# 2. Calculate the area of the rectangle formed by the current l and r.
# 3. Update the maximum area if the current area is greater than the maximum area.
# 4. If the height of the left element is less than the height of the right element, increment
# the left pointer. Otherwise, decrement the right pointer.

# we are decrementing the effective height the lower height because we are at maximum width whe we are placing the 2 pointers at both ends.
# so we have to increase height and decrease the width to check if other areas are more thean the current one.

# remember the effective height is the key.