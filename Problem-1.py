"""
Approach:
1) if you were to sort the first and last flag, your middle flag is automatically sorted
2) use two pointers to keep track of the sorted indices for 0 and 2
3) you'd need to have a 3rd pointer to make comparisons from left to right
4) swap elements at 3rd moving pointer with either left/right pointer if 0/2 is found
5) keep in mind that you'd have to make two comparisons at each index. you'd make the second comparison even if you
have swap after the first comparison

"""


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        left = 0
        right = len(nums) - 1
        curr = 0
        while curr <= right:
            if nums[curr] == 0:
                nums[curr], nums[left] = nums[left], nums[curr]
                left += 1
                curr += 1
            elif nums[curr] == 2:
                nums[curr], nums[right] = nums[right], nums[curr]
                right -= 1
            else:

                curr += 1

"""
TC: O(n)
SC: O(1)
"""

