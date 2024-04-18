# Two-Pointers-1

## Problem1 (https://leetcode.com/problems/sort-colors/)

#Approach
# Use 3 pointers. Set low = 0, high = len(nums)-1 and mid = 0. While mid <= high pointer, traverse through the nums list
# If mid == 0, swap low with mid and increment both low and mid pointer. If mid == 1, just increment mid pointer and if mid == 2, swap mid with high and decrement high
# return nums list which should be sorted as 0,1,2

# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        
        low = 0
        mid = 0
        high = len(nums)-1

        while(mid<=high):
            if nums[mid] == 0:
                temp = nums[mid]
                nums[mid] = nums[low]
                nums[low] = temp
                mid += 1
                low += 1
            elif nums[mid] == 2:
                temp = nums[mid]
                nums[mid] = nums[high]
                nums[high] = temp
                high -= 1
            else:
                mid += 1
        return nums