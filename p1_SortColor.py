# 75. Sort Colors

# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No 


class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # using -> bucket sort | count sort
        zero,one,two = 0,0,0
        for i in nums:
            if i == 0:
                zero = zero +1
            elif i == 1:
                one = one +1
            elif i == 2:
                two = two +1
        for i in range(len(nums)):
            if zero:
                nums[i] = 0
                zero = zero -1
            elif one:
                nums[i] = 1
                one = one -1
            elif two:
                nums[i] = 2
                two = two -1