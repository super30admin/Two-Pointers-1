# Time Complexity : O(n) because we are traversing the array only once
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
"""
In this code we use the two pointer approach to find the maximum area. We start with the 
two pointers at the ends of the array and move the pointer with the smaller height towards 
the other pointer. This is because if we move the pointer with the larger height, we will 
not be able to get a larger area as the width will be smaller.
"""

class Solution:
    def maxArea(self, height: List[int]) -> int:
        if height==None or len(height) == 0:
            return 0
        
        answer = 0
        left = 0
        right = len(height) - 1

        while left < right:
            current_area = min(height[left], height[right]) * (right-left)
            answer = answer if current_area < answer else current_area

            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        return answer