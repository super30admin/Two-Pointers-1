# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach: We create a 2 pointer approach, a high and a low pointer.
# We check the area between the values at these 2 pointers, and keep on updating a global variable maximum
# with the area. Then, we shift the lower value to the right (if lower value corresponds to high pointer), or to right (if it corresponds
# to low pointer).


def maxArea(height) -> int:

    low = 0
    high = len(height) - 1
    maximum = -9999
    while (low < high):
        area = (high - low) * min(height[high], height[low])
        if area > maximum:
            maximum = area

        if height[high] > height[low]:
            low = low + 1
        else:
            high = high - 1

    return maximum


print(maxArea([1,2,7,1,5]))