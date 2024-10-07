# Time Complexity (TC): O(n), where n is the length of the 'height' array. 
# We only iterate over the array once using the two-pointer technique.
# Space Complexity (SC): O(1), constant space since we are using a few variables 
# for tracking the result and the two pointers.
#
# Approach:
# - We are using a two-pointer approach to maximize the area between two lines.
# - The two pointers start at the beginning (l) and end (r) of the 'height' array.
# - We calculate the area by taking the smaller of the two heights (height[l], height[r])
#   and multiplying it by the distance between the pointers (r - l).
# - If the height at the left pointer is smaller, we move the left pointer inward (l += 1).
#   Otherwise, we move the right pointer inward (r -= 1).
# - This ensures we are always considering the largest possible container.

class Solution(object):
    def maxArea(self, height):
        res = 0
        l, r = 0, len(height) - 1

        while l < r:
            area = (r - l) * min(height[l], height[r])
            res = max(res, area)
        
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1

        return res
