## Problem1 (https://leetcode.com/problems/sort-colors/)

#Time Complexity : O(n)
# Space Complexity : O(n) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        color_map = {}
        # creating a hash map for storing the count of each color
        for i in nums:
            if i not in color_map:
                color_map[i] = 0
            color_map[i] += 1
        j = 0
        # Edit the exixting array to add these values in sorted order
        for i in range(3):
            for k in range(color_map.get(i,0)):
                nums[j] = i
                j += 1
        return nums
