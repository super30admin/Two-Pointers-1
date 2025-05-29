"""
Approach: use 3 points l for 0's, r for 2's and mid for 1's
t.c.=> O(n)
s.c. => O(1)
"""
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        l, r = 0, n - 1
        mid = 0
        while mid <= r:
            if nums[mid] == 0:
                nums[mid], nums[l] = nums[l], nums[mid]
                l += 1
                mid += 1
            elif nums[mid] == 2:
                nums[mid], nums[r] = nums[r], nums[mid]
                r -= 1
            else:
                mid += 1
        
