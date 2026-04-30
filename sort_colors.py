# Time Complexity : O(n)
# Space complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
# using 3 pointers to divide the array into sections for 0s at the front, 2s at the back, and an unexplored zone in between
# curr acts as a scanner, f it sees a 0 swaps it to the low boundary, if it sees a 2 swaps it to the high boundary, if it sees a 1 just moves forward.

class Solution(object):
    def sortColors(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        low, curr, high = 0,0,len(nums)-1
        while curr <= high:
            if nums[curr] == 0:
                nums[low], nums[curr] = nums[curr], nums[low]
                low += 1
                curr += 1
            elif nums[curr] == 1:
                curr += 1
            else:
                nums[high], nums[curr] = nums[curr], nums[high]
                high -= 1