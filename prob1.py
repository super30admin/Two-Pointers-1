# Time Complexity : O(N) 
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : I was checking if mid = 0 instead of nums[mid] = 0

class Solution:

    def swap(self, nums, l, r):

        temp = nums[l]
        nums[l] = nums[r]
        nums[r] = temp

    def sortColors(self, nums) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        lo, mid, hi = 0, 0, len(nums) - 1
        while mid <= hi:

            if nums[mid] == 0:
                self.swap(nums, lo, mid)
                lo += 1
                mid += 1
            elif nums[mid] == 2:
                self.swap(nums, mid, hi)
                hi -= 1
            else:
                mid += 1

obj = Solution()
nums = [2,0,2,1,1,0]
print(nums)
obj.sortColors(nums)
print(nums)