#TC = O(n)
#SC = O(1)
#Compiled and run on Leetcode

class Solution:
    def sortColors(self, nums: List[int]) -> None:

        l = 0
        r = len(nums) - 1
        c = 0 #extra current pointer

        while (c <= r):

            if (nums[c] == 0): #if curr pointer is at 0
                nums[l], nums[c] = nums[c], nums[l]
                l += 1
                c += 1

            elif (nums[c] == 1): #if curr pointer is at 1, do nothing - just keep incr curr ptr
                c += 1

            else: #if curr pointer is at 2
                nums[r], nums[c] = nums[c], nums[r]
                r -= 1