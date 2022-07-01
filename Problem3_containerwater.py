'''
We will use a two pointer approach to do this. For getting a better area (area = height * wisth ) we know that widh will always decrease by 1 through consecutive buckets thus the deciding factor in this problem to get biggest container will be the height.
'''

'''
time complexity : O(n)
Space complexity : O(1)
'''


class Solution:
    def maxArea(self, height: List[int]) -> int:
        # handling the null case
        if (height == None or len(height) == 0):
            return 0
        n = len(height)
        # largest container
        maximum = 0
        low = 0
        high = n - 1

        # the min term in the code is the height and the difference term is the width
        while (low < high):
            maximum = max(maximum, min(height[low], height[high]) * (high - low))
            if (height[low] < height[high]):
                low += 1
            else:
                high -= 1
        return maximum