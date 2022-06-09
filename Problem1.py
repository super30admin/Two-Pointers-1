# Time Complexity : O(n)
# Space Complexity : O(3)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#

class Solution:
    def sortColors(self, nums: list[int]):
        """
        Do not return anything, modify nums in-place instead.
        """
        dictu = {0: 0, 1: 0, 2: 0}
        for i in nums:
            dictu[i] += 1

        ptr = 0
        while dictu[0] != 0:
            nums[ptr] = 0
            ptr += 1
            dictu[0] -= 1
        while dictu[1] != 0:
            nums[ptr] = 1
            ptr += 1
            dictu[1] -= 1
        while dictu[2] != 0:
            nums[ptr] = 2
            ptr += 1
            dictu[2] -= 1
        return nums


check = Solution()
print(check.sortColors([1, 1, 2, 2, 0, 1, 2, 0, 0]))
