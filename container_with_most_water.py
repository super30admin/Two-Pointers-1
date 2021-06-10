# Time complexity : O(n)
# Space Complexity : O(1)
class Solution(object):
    def maxArea(self, height):

        #         Update left and right pointer and max value
        left = 0
        right = len(height) - 1
        max_val = 0
        #         Iterate over array till left pointer is less than right pointer
        while left < right:
            #           max value will be max between prvoius max and area with current left and right
            max_val = max(max_val, min(height[left], height[right]) * (right - left))
            #           if current left element is less than current  right then update left or else update right
            if height[left] < height[right]:
                left += 1
            else:
                right -= 1

        #        return max value
        return max_val

        """
        :type height: List[int]
        :rtype: int
        """
