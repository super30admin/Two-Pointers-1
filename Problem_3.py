#
# @lc app=leetcode id=11 lang=python3
#
# [11] Container With Most Water
#

# @lc code=start
'''
Time Complexity - O(n), we are traversing the entire array exactly once
Space Complexity - O(1), besides the array provided we only using extra variables

This code works on LeetCode
'''
class Solution:
    def maxArea(self, height: List[int]) -> int:
        low, high = 0, len(height)-1 #initialize low and high
        maxarea = -1e9 #set maxarea to a very low value
        while low < high: #we cannot have a situation where low==high as overthere area will be 0
            maxarea = max(maxarea, min(height[high], height[low])*(high - low)) #area is min of the two bars (length) * distance between the two bars and then we compare it with the current maxarea.
            if height[low] < height[high]: #move left pointer if line at low is smaller than that at high
                low+=1
            elif height[high] == height[low]: #move both pointers when the length of both the bars is higher
                low+=1
                high-=1
            else: #else move the high pointer because value at high will be smaller than that at low
                high-=1
        return maxarea
# @lc code=end

