#TC = O(n)
#SC = O(1)
#Compiled and run on Leetcode


class Solution:
    def maxArea(self, height: List[int]) -> int:
        if (height == None and len(height) < 2): #edge cases
            return 0

        maxh = 0
        l = 0
        r = len(height) - 1

        while (l < r):
            maxh = max(maxh, (r - l) * min(height[l], height[r])) #logic to find area covered by water

            if (height[l] < height[r]): #iterate thr list to find other possibilities
                l += 1
            else:
                r -= 1

        return maxh