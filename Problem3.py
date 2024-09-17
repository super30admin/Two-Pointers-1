# Time Complexity : O(h) where h is the length of list height
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def maxArea(self, height):
        if len(height) < 2:
            return 0
        elif len(height) == 2:
            return min(height)
        else:
            l = 0
            r  = len(height)-1
            max_vol = 0
            while (l < r):
                max_vol =max(max_vol, (r-l) * min(height[l], height[r]))

                if (height[l] < height[r]):
                    l += 1
                elif (height[r] < height[l]):
                    r -= 1
                else:
                    l += 1
        return max_vol

#Here I have used 2 pointers. One at the start and one at the end. The basic condition here is while left pointer is ahead of
#right pointer, then we will calculate the volume at that point and will keep on shrinking the length of coverage and if we getter better
#volume then we will update the max_volume Variable. In case when height og both the pointers are same, we can shrink from any side as it will not matter.