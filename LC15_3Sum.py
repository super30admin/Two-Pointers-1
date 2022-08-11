
"""
TC = O(n*n)
SC+O(n)

"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i]>0:
                break
            if i == 0 or nums[i-1]!=nums[i]:
                self.twoSum(nums, i ,res)
        return res
    def twoSum(self,nums, i, res):
        seen = set()
        j=i+1
        while j<len(nums):
            complement = -nums[i]-nums[j]
            if complement in seen:
                res.append([complement, nums[i], nums[j]])
                while j+1<len(nums) and nums[j]==nums[j+1]:
                    j+=1
            seen.add(nums[j])
            j+=1
                
"""
TC = O(n*n)
SC+O(n)
"""
class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()
        for i in range(len(nums)):
            if nums[i]>0:
                break
            if i == 0 or nums[i-1]!=nums[i]:
                self.twoSumII(nums, i ,res)
        return res
    def twoSumII(self,nums, i, res):
        low = i+1
        high = len(nums)-1
        while(low<high):
            sum = nums[i]+nums[low]+nums[high]
            if sum<0:
                low+=1
            elif sum>0:
                high-=1
            else:
                res.append([nums[i], nums[low], nums[high]])
                low+=1
                high-=1
                while low<high and nums[low]==nums[low-1]:
                    low+=1
                    