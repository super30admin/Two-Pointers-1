#Time Complexity : O(n^2)
#Space Complexity :O(1)
#Did this code successfully run on Leetcode :Yes
#Any problem you faced while coding this :No

class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        output =[]
        for i,a in enumerate(nums):
            if i >0 and a ==nums[i-1]:
                continue
            l,r= i+1, len(nums)-1
            while l<r:
                sumTotal = a+nums[l]+nums[r]
                if sumTotal>0:
                    r-=1
                elif sumTotal<0:
                    l+=1
                else:
                    output.append([a,nums[l],nums[r]])
                    l+=1
                    while nums[l] == nums[l-1] and l<r:
                        l+=1
        return output 
