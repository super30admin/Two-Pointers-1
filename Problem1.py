# https://leetcode.com/problems/sort-colors/description/

# 3 pointers approach
# TC: o(n)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        low = 0
        mid = 0
        high = len(nums) - 1

        while mid <= high:
            if nums[mid] == 2:
                self.swap(nums, mid, high)
                high -= 1
            elif nums[mid] == 0:
                self.swap(nums, mid, low)
                low += 1
                mid += 1
            else:
                mid += 1
            
    def swap(self, nums, x, y):
        temp = nums[x]
        nums[x] = nums[y]
        nums[y] = temp