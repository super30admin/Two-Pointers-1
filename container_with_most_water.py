# Time Complexity -  O(n)
# Space Complexity -  O(1) 

# Initialize two pointers, left and right, to the beginning and end of the array, respectively.
# Calculate the area between the two lines at the current positions of left and right.
# Update the maximum area if the current area is larger.
# Move the pointer of the shorter line towards the other pointer. This is because the area is limited by the shorter line, so moving the pointer of the taller line wouldn't increase the area.
# Repeat this process until left meets right.

def maxArea(height):
    max_area = 0
    left, right = 0, len(height) - 1
    while left < right:
        area = min(height[left], height[right]) * (right - left)
        max_area = max(max_area, area)
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
    return max_area
