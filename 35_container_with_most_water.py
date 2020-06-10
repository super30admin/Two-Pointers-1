# June 10, 2020
# Referred the leetcode solution to confirm

class Solution:
    def maxArea(self, height: List[int]) -> int:

        # Time Complexity : O(n)
        # Both the pointers traverse through the array in a given direction only once
        # Space Complexity : O(1)
        # Only the maximum area, and to pointers require a constant space
        # The array itself does not need any space, because we are not duplicating the array

        '''
        - Draw the diagram, rather than just playing with array
        - check the edge case n = 2, meaning the array has minimum 2 values, so no need to check array with 0 or 1 value
        - Two pointers because we know, there are two bars, no other condition to be satisfied
        - one pointer at the start and one pointer at the end, keep traversing until the end and keep updating the max area
        - There could be a way where we keep one pointer constant and then just keep moving the other, but moving both pointer
           just helps with thinking, the time complexiy should be the same in both the cases
         - one other way to form question, can be allowing slant heights, in that case do not find min of both heights,
           formula for area will change, as we have a triangle + rectangle
        Problems:
        - Confusion if max and min functions increase any time complexity, which I may not have considered in O(n)
        - When to stop ? --> l<r, DO NOT check for l<=r, because then we are checking one bar with its ownself
        - check min of both heights and not max of both heights
        '''

        # works in Leet code

        maxArea = 0
        left = 0
        right = len(height) - 1

        while left < right:

            currArea = min(height[left], height[right]) * (right - left)
            maxArea = max(maxArea, currArea)

            # irrespective of the condition below for comparison, we traverse through the entire array eventually
            if height[left] < height[
                right]:  # since we want max area, we move the pointer with smaller value ( just a preference)
                left += 1
            else:
                right -= 1

            print(maxArea)
        return maxArea