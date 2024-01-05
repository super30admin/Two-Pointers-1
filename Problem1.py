'''

Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No issues faced

Your code here along with comments explaining your approach

Use two pointers starting right next to each other and traverse the array
'''


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i = 0
        j = 1
        while i < len(nums) - 1:
            while j < len(nums):
                if nums[i] > nums[j]:
                    temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp

                    if nums[i] == 0:
                        i += 1
                        j = i + 1
                        continue
                j += 1

            i += 1
            j = i + 1