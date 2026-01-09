''' Time Complexity : O(n^2) 
    Space Complexity : O(1) 
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this :  No


   Approach : Fix the 1st number and run 2sum on rest array using TWO - pointers
'''
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        print(nums)
        n = len(nums)
        res = []
        for i in range(n-1):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l, r = i+1, n-1
            while l < r:
                summ = nums[i] + nums[l] + nums[r]
                if summ == 0:
                    res.append([nums[i],nums[l],nums[r]])
                    l += 1
                    r -= 1
                    while l < r and nums[l] == nums[l-1]:
                        l += 1
                    while l < r and nums[r] == nums[r+1]:
                        r -= 1
                elif summ > 0:
                    r -= 1
                else:
                    l += 1
        return res


        