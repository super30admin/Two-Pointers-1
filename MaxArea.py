class MaxArea(object):

    '''
    Solution:
    1.  Maintain two pointers low and high before calculating the max area of all chunks available.
    2. As you decrease one of the two pointers, width decreases and so move one of low and high pointers such that height
        increases with a hope that area might increase.
    3. Keep track of max area at every move of low or high pointers and return it.

    --- Passed all testcases on leetcode successfully
    O(n) Time Complexity | O(1) Space Complexity
    '''
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maxArea = 0
        if (height == None or len(height) == 0):
            return maxArea

        low = 0
        high = len(height) - 1

        while (low < high):
            currentArea = min(height[low], height[high]) * (high - low)         # height will be minimum always
            maxArea = max(maxArea, currentArea)                                 # check whether area beats max area
            if (height[low] < height[high]):                                    # move low/high to a bigger height
                low += 1
            else:
                high -= 1

        return maxArea