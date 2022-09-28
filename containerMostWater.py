"""
https://leetcode.com/problems/container-with-most-water/)
Approach --
- Use 2 pointers. Left on the 0th index and right on the n-1 index. left and right pointers are height of each element
- width = index(right) - index(left)
- minheight = min height out of two
- capacity = width x minheight
- if left pointer < right pointer --> move left pointer. else mov right pointer
- if both left and right pointer have same height, then move either
- Use max variable to compare capacity with max val
- Traverse till max is reached

TC - O(N)
SC - O(1)
"""

h = [1, 8, 6, 2, 5, 4, 8, 3, 7]


def containerMostWater(height):
    if height is None or len(height) < 2:
        return 0
    n = len(height)
    maxVal = 0
    left = 0
    right = n - 1

    while left <= right:
        maxVal = max(maxVal, min(height[left], height[right]) * (right-left))
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    return maxVal


print(containerMostWater(h))
