## Problem1 (https://leetcode.com/problems/sort-colors/)

# Time Complexity : o(n)
# Space Complexity : o(1)

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        lt=i=0
        gt = len(nums) - 1
        while i <= gt:
            if nums[i] < 1:
            #every num <1 should be swapped to lt
                nums[lt], nums[i] = nums[i], nums[lt]
                i += 1
                lt += 1
            elif nums[i] == 1:
                i += 1

            else:
                if nums[gt] >1:
                    gt -= 1
                else:
                    nums[gt], nums[i] = nums[i], nums[gt]