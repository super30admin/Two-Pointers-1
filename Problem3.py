#
# Time Complexity = O(n)
# Space Complexity = O(1)
#
def maxArea(height):
    max_area = 0
    i = 0
    j = len(height)-1
    while i <= j:
        area = min(height[i], height[j])*(j-i)
        if area > max_area:
            max_area = area
        if height[i] < height[j]:
            i += 1
        else:
            j -= 1
    return max_area
