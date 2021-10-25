#Time Complexity :O(n^2)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode : yes

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        nums.sort()
        for i,a  in enumerate(nums):
#If element is duplicate, increment
            if i>0 and a == nums[i-1]:
                continue
            l = i+1
            r = len(nums)-1
            while(l<r):
                threeSum = a+nums[l]+nums[r]
                if threeSum>0:
                    r -= 1
                elif threeSum<0:
                    l += 1
                else:
                    ans.append([a,nums[l],nums[r]])
                    l +=1
                    while nums[l]==nums[l-1] and l<r:
                        l += 1
        return ans
        