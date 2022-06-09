# 75. Sort Colors
"""
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO

Using quick selection. keeping  first element fixed and finding minimum element from next element till last element.
Then swapping that min and fised element.
Logic behind this is that first all 0s will be filled at its location, then 1 and then 2.

"""


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # empty array
        if len(nums) == 0:
            return []

        # non-empty array
        # for array length = 1
        if len(nums) == 1:
            return nums

        else:
            for i in range(0, len(nums)):
                m = i
                for j in range(i, len(nums)):
                    if nums[m] >= nums[j]:
                        m = j

                # swapping
                nums[i], nums[m] = nums[m], nums[i]

        return nums