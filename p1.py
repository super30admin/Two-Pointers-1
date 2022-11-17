
## Problem1 (https://leetcode.com/problems/sort-colors/)
# TC : O(n)
# SC : O(1)
class Solution:
    def sortColors(self, nums: List[int]) -> None:
        p0 = 0
        p2 = len(nums) - 1
        curr = 0
        while curr <= p2:
            if nums[curr]==2:
                nums[curr], nums[p2] = nums[p2], nums[curr]
                p2 -= 1
            elif nums[curr]==0:
                nums[curr], nums[p0] = nums[p0], nums[curr]
                p0 += 1
                curr += 1
            else:
                curr += 1
                
# TC : O(n)
# SC : O(1)
        # """
        # Do not return anything, modify nums in-place instead.
        # """
        # d = {0:0,1:0,2:0}
        # for i in nums:
        #     d[i] += 1
        # k = 0
        # l = 0
        # for i in d.keys():
        #     nums[k:d[i]+k] = [i]*d[i]
        #     k += d[i]
        #     # print(nums)