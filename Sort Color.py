#TC:O(n)
#SC:O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        l, mid = 0,0
        r = len(nums) - 1
        while mid <= r:
            while l < len(nums) and nums[l] == 0:
                l += 1
                mid += 1
            while mid <= r and nums[mid] == 1:
                mid += 1
            if mid <= r and nums[mid] == 0:
                nums[mid] , nums[l] = nums[l], nums[mid]
                l += 1
            if mid <= r and nums[mid] == 2:
                nums[mid] , nums[r] = nums[r], nums[mid]
                r -= 1
          