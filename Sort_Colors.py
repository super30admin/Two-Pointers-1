# Time Complexity : O(N)
# Space Complexity : O(1)


from typing import List

class Solution:
    def sortColors(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        # count the number of 0s, 1s, and 2s in nums
        count = [0, 0, 0]
        for n in nums:
            count[n] += 1
        
        # overwrite nums with the sorted values
        i = 0
        for j in range(3):
            while count[j] > 0:
                nums[i] = j
                i += 1
                count[j] -= 1

s1  = Solution()
nums = [2,0,2,1,1,0]
s1.sortColors(nums)
