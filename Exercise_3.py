# ## Problem3 (https://leetcode.com/problems/container-with-most-water/)
# // Time Complexity :O(n)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :No


# // Your code here along with comments explaining your approach
def maxArea(height):
    # 2ptrs
    left = 0
    right = len(height) - 1
    # for storing area
    area = max_area = 0
    while left < right:
        # finding area between the two ptrs
        area = min(height[left], height[right]) * (right - left)
        # keeping the maximum area
        max_area = max(max_area, area)
        # updating ptrs
        if height[left] >= height[right]:
            right -= 1
        else:
            left += 1
    return max_area


height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
print(maxArea(height))
