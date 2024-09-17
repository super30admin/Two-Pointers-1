# Time Complexity : O(h) where h is the length of list nums
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : Yes. To keep the track of three pointers



class Solution:
    def sortColors(self, nums):
        low = 0
        mid = 0
        high = len(nums) - 1

        while (mid <= high):
            val = nums[mid]
            if val == 0:
                nums[low], nums[mid] = nums[mid], nums[low]
                low += 1
                mid += 1
            elif val == 1:
                mid += 1
            elif val == 2:
                nums[high], nums[mid] = nums[mid], nums[high]
                high -= 1
        return nums


# In this problems I have used 3 pointers. "low" points at the first 1 in the list. "mid" is for iterating the list
# and "high" is the pointer and points where 2 needs to be entered when encountered.