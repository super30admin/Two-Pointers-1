"""
TC: O(N) {we use two pointers to iterate each height only once}
SC: O(1) {no extra space is used here}

Approach:

We initialize two pointers, one at the start and one at the end. Now for each pair of pointer position we save our max area/water
that can be store and also update the pointers based on the minimum height between the two pointers, since the area of water depends on the height.


The problem ran successfully on Leetcode.
"""
from typing import List

class Solution:
    def maxArea(self, height: List[int]) -> int:
        #formula for max_area = (r-l-1) * min(height[r], height[l])
        l,r = 0, len(height) - 1
        max_water = float('-inf')

        while l<r:
            if height[l] <= height[r]:
                curr_water = height[l] * (r - l )
                l+=1
            else:
                curr_water = height[r] * (r - l )
                r-=1
            
            max_water = max(curr_water, max_water)
        
        return max_water
