#Time Complexity : O(n)
#Space Complexity : O(n)
#Any problem you faced while coding this : -

#The approach is to maintain three pointers for tracking the partitions for three different color numbers. Swap operations is performed while sorting the numbers and the three pointers are moved accordingly.

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        lp = 0
        mid = lp
        rp = n - 1

        while mid <= rp:
            if nums[mid] == 2:
                nums[mid], nums[rp] = nums[rp], nums[mid]
                rp -= 1
            elif nums[mid] == 0:
                nums[mid], nums[lp] = nums[lp], nums[mid]
                lp += 1
                mid += 1
            else:
                mid += 1

        return