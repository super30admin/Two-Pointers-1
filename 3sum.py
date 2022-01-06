# Time Complexity - O(n^2)
# Space Complexity - O(1)

class Solution:
    
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        result = set()
        for i in range(len(nums)):
            target = -1*nums[i]
            low = i+1
            high = len(nums)-1
            if i!=0 and nums[i]==nums[i-1]:
                continue
            while low<high:
                if nums[low]+nums[high]==target:
                    li = nums[i],nums[low],nums[high]
                    result.add(li)
                    low=low+1
                    high=high-1
                elif nums[low]+nums[high]<target:
                    low=low+1
                else:
                    high=high-1
        return result
