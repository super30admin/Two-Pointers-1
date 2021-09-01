# Did this code successfully run on Leetcode : NO, TLE

# approach
# brute force
# calculate volume between every two indices
# TC: O(n^2)
# SC: O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0
        for i in range(len(height)-1):
            for j in range(i+1, len(height)):
                dis = j - i
                cap = min(height[i], height[j])
                res = max(res, cap*dis)
        return res

# Did this code successfully run on Leetcode : YES

# approach
# two pointers
# start with l = 0, r = n-1
# when to move which pointer: whichever of nums[l] and nums[r] is smaller move that pointer
# intuition: capacity will be limited by smaller of the two so if we move closer (reduce the width), the only option to increase the height is
# to move away from the smaller one
# TC: O(n)
# SC: O(1)

class Solution:
    def maxArea(self, height: List[int]) -> int:
        res = 0
        l, r = 0, len(height)-1
        while l < r:
            res = max(res, (min(height[l], height[r]) * (r-l)))
            if height[l] <= height[r]:
                l += 1
            else:
                r -= 1
        return res