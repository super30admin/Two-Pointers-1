# Time Complexity - O(N)

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : No

# Any problem you faced while coding this : No

# Approach
# I use three-pointer approach wherein low =0, mid=0 and high = n-1. low handles the front of the array , mid is used for traversing
# and high handles the back of the array.

class Solution:
    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if nums == None or len(nums) == 0:
            return None

        low, mid, high = 0, 0, len(nums) - 1

        while (mid <= high):
            if (nums[mid] == 0):
                self.swap(nums, low, mid)
                mid += 1
                low += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            else:
                mid += 1

