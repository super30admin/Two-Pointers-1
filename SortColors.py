# Time Complexity : O(n)
# Space Complexity : O(n)

# The code ran on LeetCode

# Maintain 3 pointers: left, mid and right. left = mid = 0 and right = n -1. Iterate over nums array, if mid points to 0 swap it with left and increment left and mid by one unit. If mid points to 2, swap it with right value and decrement right pointer by one unit. If mid == 1, increment it by one. The array will be sorted when mid crosses right pointer

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        l = mid = 0; r = n -1

        while mid <= r:
            if nums[mid] == 2:
                nums[mid], nums[r] = nums[r], nums[mid]
                r-=1
            elif nums[mid] == 0:
                nums[mid], nums[l] = nums[l], nums[mid]
                l+=1
                mid+=1
            else:
                mid+=1
        return nums