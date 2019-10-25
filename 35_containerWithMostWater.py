# accepted in leetcode
# time - O(N), space - O(1)
# As we need to find maxarea, so we have to start from left and right most points in an array as they have maximum
# breadth, from next iteration though height increases breadth decreases.
# Always capture the maximum area in avariable whenever we encounter in the iteration.
class Solution:
    def maxArea(self, height: List[int]) -> int:
        n = len(height)
        left = 0
        right = n - 1
        maxArea = 0
        while left < right:
            if height is None or len(height) == 0: return 0
            # calculate current area as minimum of both heights multiplied by right - left pointer.
            currArea = min(height[left],height[right])*(right-left)
            if min(height[left],height[right]) == height[right]: # whichever height is minimum move that pointer.
                if currArea > maxArea:
                    maxArea = currArea
                right -= 1
            else:
                if currArea > maxArea:
                    maxArea = currArea
                left += 1
        return maxArea