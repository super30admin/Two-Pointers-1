'''
T.C: O(N)
S.C: O(1)

Intuition: using three pointers, left, mid and right respective to the numbers and loop
- 
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        if not nums:
            return []
        
        lp, mid, rp = 0, 0, len(nums) - 1
        
        while mid <= rp:
            if nums[mid] == 0:
                nums[lp], nums[mid] = nums[mid], nums[lp]
                lp += 1
                mid += 1
            elif nums[mid] == 1:
                mid += 1
            else:
                nums[mid], nums[rp] = nums[rp], nums[mid]
                rp -= 1
        return nums