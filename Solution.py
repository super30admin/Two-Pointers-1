"""
Time complexity 0(n)

Space 0(1)

-if the current index is ==1, shift 2 to that index and 1 will come in place of 2 if any before that. K keeps the index of 2 

-if current val is ==0, need to do two shift , one for 0 and one for 1.
"""


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        if nums is None or len(nums)==0:
            return 
        """
        Do not return anything, modify nums in-place instead.
        """
        j,k=0,0
        for idx in range(len(nums)):
            if nums[idx] == 1:
                nums[idx], nums[k] = nums[k], nums[idx]
                k = k + 1
            if nums[idx] == 0:
                nums[idx], nums[k] = nums[k], nums[idx]
                nums[j], nums[k] = nums[k], nums[j]
                j, k = j+1, k+1