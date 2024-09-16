# leetcode succesfull
# no doubts
# time complexity : O(n)
# space complexity: O(1)

# explainiation: Here out intention is two find the maximum valoume. So we will need two pointers which we will be moving inward. We will find the maxera
# by multiplying the minimum height and the distance between the two lines and make it maxarea

# we will be moving toward the minimum height towards a better hegiht with the intention to find MAX value.
# If we stick with minimum height,it will always be minimum. WE need to increase the volume,, so we move forward looking for other heights

class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        start = 0
        end = len(height) - 1
        maxarea = 0
        while (start < end):
            # for i in range(len(height)):
            minheight = min(height[start], height[end])
            maxarea = max(maxarea, minheight * (end - start))
            if height[start] < height[end]:
                start += 1
            else:
                end -= 1
        return maxarea
