class Solution(object):
    def maxArea(self, height):
        """
        Finds the maximum area of water that can be contained between two vertical lines.
        Time complexity: O(n), where n --> length of the height list.
        Space complexity: O(1).
        :type height: List[int]
        :rtype: int
        """
        maxi = 0  # maximum area
        l = 0  # Left pointer --> beginning of the list
        r = len(height) - 1  # Right pointer --> end of the list

        # Continue the loop until the left and right pointers meet
        while l < r:
            # Calculate the current area based on the shorter vertical line and the distance between the lines
            current_area = min(height[l], height[r]) * (r - l)

            # Update the maximum area if the current area is greater
            maxi = max(maxi, current_area)

            # Move the pointer that corresponds to the shorter line inward
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1

        return maxi  # return maximum area
