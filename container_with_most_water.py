"""
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
"""


def max_area(height):
    left, right = 0, len(height) - 1
    max_area = min(height[left], height[right]) * abs(right - left)

    while left <= right:
        if height[left] < height[right]:
            left += 1
        else:
            right -= 1
        max_area = max(max_area, min(
            height[left], height[right]) * abs(right - left))

    return max_area


height = [1, 8, 6, 2, 5, 4, 8, 3, 7]
print(max_area(height))

print(max_area([1, 1]))
