"""
Time complexity: O(n)
Space complexity: O(1)
"""

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        nlen = len(nums)
        mid = 0
        l = 0
        r = nlen -1 

        while(mid <= r):
            if(nums[mid] == 0):
                self.swap(nums, mid, l)
                l += 1
                mid += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, r)
                r -= 1
            else:
                mid += 1
        return nums

    def swap(self, nums, i, j):
        temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp

