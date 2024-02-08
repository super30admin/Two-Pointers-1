'''
TC: O(nlogn)+O(n^2) ~ O(n^2)
SC: O(n)
'''
from typing import List

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = set()
        nums.sort()
        val = False

        for i in range(len(nums)):
            if val!=False and val == nums[i]:
                continue
            val = nums[i]
            l, r = i+1, len(nums)-1
            target = -val
            
            while l<r:
                if nums[l]+nums[r] == target:
                    res.add((val, nums[l], nums[r]))
                    l+=1
                elif nums[l]+nums[r] < target:
                    l += 1
                else:
                    r -= 1
        return res
s = Solution()
print(s.threeSum([-1,0,1,2,-1,-4]))
print(s.threeSum([0,1,1]))
print(s.threeSum([0,0,0]))
print(s.threeSum([0,0,0,0]))