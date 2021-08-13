# Time Complexity: O(n), We look at the array once with two pointers
# Space Complexity: O(1), No additional arrays are used
def maxArea(height: list[int]) -> int:
    if not height or not len(height):
        return 0
    max_area = 0
    l = 0
    h = len(height) - 1
    while l < h:
        max_area = max(max_area, min(height[l], height[h])* (h-l))
        if height[l] < height[h]:
            l += 1
        else:   # If they're same, we decrement the high pointer
            h -= 1
    return max_area