'''
Time Complexity :O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode : Yes
Explanation: Choose 2 pointers one for the 0's and one for the 2's, we know that 0's should start from beginning so set
right = 0 and 2's from the end so set left = len(nums)-1. Now as we see a 0 we move it to the nums[right] index and swap
it will the current element, similarly we do the same thing with left. If we see 1 we just skip it. Hence we place the 0's
and 2's in the right place using the 2 pointer and the 1's automatically get placed in the middle.
'''
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """

        right = 0
        left = len(nums) - 1
        i = 0
        while i <= left:
            if nums[i] == 0:
                temp = nums[i]
                nums[i] = nums[right]
                nums[right] = temp
                right += 1
                i += 1
            elif nums[i] == 2:
                temp = nums[i]
                nums[i] = nums[left]
                nums[left] = temp
                left -= 1
            else:
                i += 1

