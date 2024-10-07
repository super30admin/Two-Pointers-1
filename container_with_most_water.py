class Solution:
    def maxArea(self, height):

        result = 0
        l = 0
        r = len(height) - 1

        while l < r:
            # Calculate the current area
            area = (r - l) * min(height[l], height[r])

            result = max(result, area)

            if height[l] < height[r]:
                l += 1  # Move the left pointer rightward
            else:
                r -= 1  # Move the right pointer leftward

        return result


# time complexity: O(n)
# space complexity: O(1)
