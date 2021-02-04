# Time Complexity :O(n)
# Space Complexity :O(1)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 11

# Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
# n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines,
# which, together with the x-axis forms a container, such that the container contains the most water.
#
# Notice that you may not slant the container.

# Input: height = [1,8,6,2,5,4,8,3,7]
# Output: 49
# Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
# In this case, the max area of water (blue section) the container can contain is 49.
# Example 2:
#
# Input: height = [1,1]
# Output: 1
# Example 3:
#
# Input: height = [4,3,2,1,4]
# Output: 16
# Example 4:
#
# Input: height = [1,2,1]
# Output: 2

def main():
    height = [1,8,6,2,5,4,8,3,7]
    ans = maxArea(height)
    print(ans)

def maxArea(height):
    """
    :type height: List[int]
    :rtype: int
    """

    # If the len < 2 return
    if not height or len(height) == 1:
        return

    # Left as first bar and right as last bar
    left = 0
    right = len(height) - 1
    maxArea = 0

    # While they both fullfil the below condition
    while (left < right):

        # The maxArea could be the lower box height multiply by width i.e the distance between right and left index.
        maxArea = max(maxArea, min(height[left], height[right]) * (right - left))

        # To try next bigger we need to check. If value at left one is smaller we try to move left forward.
        if height[left] < height[right]:
            left += 1
        # If value at right is smaller is then move right backward.
        else:
            right -= 1

    return maxArea

if __name__ == '__main__':
    main()
