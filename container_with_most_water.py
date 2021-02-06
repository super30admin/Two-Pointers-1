# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach: We create a 2 pointer approach, a high and a low pointer.
# We check the area between the values at these 2 pointers, and keep on updating a global variable maximum
# with the area. Then, we shift the lower value to the right (if lower value corresponds to high pointer), or to right (if it corresponds
# to low pointer).

def maxArea(height):
    if len(height) == 0:
        return 0

    max_water = 0

    #  2 pointers
    left = 0
    right = len(height) - 1

    while (left < right):
        max_water = max(max_water, (right - left) * min(height[left], height[right]))

        if height[left] < height[right]:
            left += 1
        else:
            right -= 1

    return max_water


print(maxArea([1,2,7,1,5]))